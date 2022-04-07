package com.nhnacademy.bankservice;

public class Money {
    private int money;
    private String currency;
    private String code;

    public Money(String code, int money, String currency) {
        this.money = money;
        this.currency = currency;
        this.code = code;
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
}
