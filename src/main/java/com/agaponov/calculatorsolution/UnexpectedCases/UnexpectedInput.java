package com.agaponov.calculatorsolution.UnexpectedCases;

public class UnexpectedInput extends Exception {

    public UnexpectedInput() {
        super("Ввод данных содержит ошибку");
    }
}