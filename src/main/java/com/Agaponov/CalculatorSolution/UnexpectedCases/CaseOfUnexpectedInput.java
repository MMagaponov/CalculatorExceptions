package com.Agaponov.CalculatorSolution.UnexpectedCases;

public class CaseOfUnexpectedInput extends Exception {

    public CaseOfUnexpectedInput() {
        super("Ввод данных содержит ошибку");
    }
}