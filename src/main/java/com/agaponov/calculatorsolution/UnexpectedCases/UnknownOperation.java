package com.agaponov.calculatorsolution.UnexpectedCases;

public class UnknownOperation extends Exception{
    public UnknownOperation(){
        super("Математическая операция введена с ошибкой");
    }
}
