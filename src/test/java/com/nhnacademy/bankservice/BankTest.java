package com.nhnacademy.bankservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.nhnacademy.exceptions.DifferentCurrencyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankTest {
    Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }
    @DisplayName("은행에 돈을 넣을시 올바른 통화에 맞게 추가되었는지")
    @Test
    void addMoneyTest() {
        Money money = new Money("0001", 1000, "WON");

        bank.addMoneyRepository(money);
        bank.addMoney("0001", 1000, "WON");

        assertThat(bank.getResult("0001")).isEqualTo("2000 WON");

        assertThatThrownBy(()->bank.addMoney("0001", 1000, "DOL"))
            .isInstanceOf(DifferentCurrencyException.class).hasMessage("통화가 다릅니다.");
//        Money money2 = new Money(2000,"WON");
        assertThat(money.getResult()).isEqualTo("2000 WON");

//        bank.addMoney("0001", -1000,"DOL");
    }

}