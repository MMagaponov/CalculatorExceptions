package com.Agaponov.CalculatorSolution;

import com.Agaponov.CalculatorSolution.UnexpectedCases.CaseOfUnexpectedInput;
import com.Agaponov.CalculatorSolution.UnexpectedCases.CaseOfOperationUnknown;
import com.Agaponov.CalculatorSolution.UnexpectedCases.CaseOfFalseOperands;


public class Main {
    public static void main(String[] args) {
        System.out.printf("Перечислите через пробел данные к вычислению, используйте шаблон: X operator Y.\n" +
                "Операторы на выбор:+, -, *, ^, /, log, sqrt\n");
        Calculator calculator = new Calculator();
        try {
            calculator.checkUserInput();
            calculator.calculate();
        } catch (CaseOfFalseOperands e) {
            System.out.println(e.getMessage());
        } catch (CaseOfUnexpectedInput e) {
            System.out.println(e.getMessage());
        } catch (CaseOfOperationUnknown e) {
            System.out.println(e.getMessage());
        }

    }
}