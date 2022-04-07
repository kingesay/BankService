package com.nhnacademy.bankservice;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Money> bankRepository = new HashMap<>();

    public void addMoneyRepository(Money money) {
        bankRepository.put(money.getCode(), money);
    }

    public void addMoney(Money money, int depositMoney, String won) {
        money.addMoney(depositMoney);
        System.out.println(bankRepository.get(money.getCode()));
    }

    public String getResult(Money money) {
        return bankRepository.get(money.getCode()).getResult();
    }

    private Map<String, Money> getbankRepostiory() {
        return bankRepository;
    }
}
