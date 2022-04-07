package com.nhnacademy.bankservice;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.nhnacademy.exceptions.InvalidInputException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @DisplayName("잘못된 머니 추가확인")
    @Test
    void initMoneyCheck() {
        assertThatThrownBy(() -> new Money("0001", -1000, "WON"))
            .isInstanceOf(InvalidInputException.class)
            .hasMessageContainingAll("음수");
    }
}