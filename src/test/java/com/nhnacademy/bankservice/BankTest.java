package com.nhnacademy.bankservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {
    Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    void addMoneyTest() {
        Money money = new Money("0001", 1000, "WON");

        bank.addMoneyRepository(money);
        bank.addMoney(money, 1000, "WON");

        assertThat(bank.getResult(money)).isEqualTo("2000 WON");

//        Money money2 = new Money(2000,"WON");
//        assertThat(money.getMoney()).isEqualTo(money2.getMoney());
    }
}