package com.Agaponov.CalculatorSolution;

/**
 * Интерфейс описывающий операцию над двумя операндами
 */
public interface BinaryOperation {

    /**
     * Расчитывает результат для двух операндов
     *
     * @param left  левый операнд
     * @param right правый операнд
     * @return результат операции
     */
    double resultFor(double left, double right);
}