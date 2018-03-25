package com.Agaponov.CalculatorSolution;

public class MathLog implements BinaryOperation {

    public double resultFor(double left, double right) {
        return Math.log(left) / Math.log(right);
    }
}