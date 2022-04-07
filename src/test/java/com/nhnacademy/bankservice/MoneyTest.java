package com.nhnacademy.bankservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @DisplayName("잘못된 머니 추가확인")
    @Test
    void initMoneyCheck(){
        Money money = new Money("0001",-1000,"WON");
        assertThatThrownBy(money)
    }
}