package com.nhnacademy.exceptions;

public class DifferentCurrencyException extends RuntimeException {
    public DifferentCurrencyException(String message) {
        super(message);
    }
}
