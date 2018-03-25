package com.Agaponov.CalculatorSolution.UnexpectedCases;

public class CaseOfOperationUnknown extends Exception{
    public CaseOfOperationUnknown(){
        super("Математическая операция введена с ошибкой");
    }
}
