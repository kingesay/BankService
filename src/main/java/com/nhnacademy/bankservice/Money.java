package com.nhnacademy.bankservice;

import com.nhnacademy.exceptions.InvalidInputException;

public class Money {
    private int money;
    private String currency;
    private String code;

    public Money(String code, int money, String currency) {
        checkCorrectInput(money);
        this.money = money;
        this.currency = currency;
        this.code = code;
    }

    private void checkCorrectInput(int money) {
        if(money<0)
            throw new InvalidInputException("상수로 입력해 주세요");
    }

    public int addMoney(int money) {
        return this.money += money;
    }

    public int getMoney() {
        return this.money;
    }

    public String getCode() {
        return this.code;
    }

    public String getResult() {
        return money + " " + currency;
    }

    public String getCurrency() {
        return currency;
    }
}
