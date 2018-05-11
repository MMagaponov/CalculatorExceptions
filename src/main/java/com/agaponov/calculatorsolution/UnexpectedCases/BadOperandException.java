package com.agaponov.calculatorsolution.UnexpectedCases;

public class BadOperandException extends Exception{
    public BadOperandException() {
        super("Операнд был введен с неправильно.");
    }
}