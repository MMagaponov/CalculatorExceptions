package com.agaponov.calculatorsolution;

public class MathPow implements BinaryOperation {

    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }
}