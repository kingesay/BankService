package com.nhnacademy.bankservice;

import com.nhnacademy.exceptions.DifferentCurrencyException;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Money> bankRepository = new HashMap<>();

    public void addMoneyRepository(Money money) {
        bankRepository.put(money.getCode(), money);
    }

    public void addMoney(String moneyId, int depositMoney, String currency) {
        checkEqualsCurrency(bankRepository.get(moneyId), currency);
        bankRepository.get(moneyId).addMoney(depositMoney);
    }

    private void checkEqualsCurrency(Money money, String currency) {
        if(!money.getCurrency().equals(currency))
            throw new DifferentCurrencyException("통화가 다릅니다.");
    }

    public String getResult(String moneyId) {
        return bankRepository.get(moneyId).getResult();
    }

    private Map<String, Money> getbankRepostiory() {
        return bankRepository;
    }
}
