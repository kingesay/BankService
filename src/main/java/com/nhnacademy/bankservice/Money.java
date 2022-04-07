package com.nhnacademy.bankservice;

public class Money {
    private int cash;
    private String currency;
    public Money(int money, String currency) {
        this.cash = money;
        this.currency = currency;
    }

    public int add(int money, String currency) {
        return this.cash += money;
    }

    public int getMoney() {
        return this.cash;
    }
}
