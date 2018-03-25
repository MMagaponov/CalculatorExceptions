package com.Agaponov.CalculatorSolution;

public class SquareRoot implements BinaryOperation{

    public double resultFor(double left, double right) {
        return Math.pow(left,1.0/right);
    }
}