package com.nhnacademy.bankservice;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Money> bankRepository = new ArrayList<>();

    public void add(Money money, int i) {

        bankRepository.add(money);
        return true;
    }
}
