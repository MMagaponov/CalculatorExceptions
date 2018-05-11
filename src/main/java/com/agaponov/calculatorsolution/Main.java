package com.agaponov.calculatorsolution;

import com.agaponov.calculatorsolution.UnexpectedCases.UnexpectedInput;
import com.agaponov.calculatorsolution.UnexpectedCases.UnknownOperation;
import com.agaponov.calculatorsolution.UnexpectedCases.BadOperandException;


public class Main {
    public static void main(String[] args) {
        System.out.printf("Перечислите через пробел данные к вычислению, используйте шаблон: X operator Y.\n" +
                "Операторы на выбор:+, -, *, ^, /, log, sqrt\n");
        Calculator calculator = new Calculator();
        try {
            calculator.checkUserInput();
            calculator.calculate();
        } catch (BadOperandException e) {
            System.out.println(e.getMessage());
        } catch (UnexpectedInput e) {
            System.out.println(e.getMessage());
        } catch (UnknownOperation e) {
            System.out.println(e.getMessage());
        }

    }
}