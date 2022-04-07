package com.nhnacademy.bankservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {
    Bank bank;
    @BeforeEach
    void setUp() {
        bank =new Bank();
    }

    @Test
    void addMoneyTest(){
        Money money = new Money(1000,"WON");

        bank.add(money);
        assertThat(bank.getMoneyRepostiory().get(money.getCode())).isEqualTo(2000);

        Money money2 = new Money(2000,"WON");
        assertThat(money.getMoney()).isEqualTo(money2.getMoney());
        
    }
}