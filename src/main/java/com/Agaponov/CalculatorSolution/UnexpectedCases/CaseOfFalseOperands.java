package com.Agaponov.CalculatorSolution.UnexpectedCases;

public class CaseOfFalseOperands extends Exception{
    public CaseOfFalseOperands() {
        super("Операнд был введен с неправильно.");
    }
}