package com.Agaponov.CalculatorSolution;

import com.Agaponov.CalculatorSolution.UnexpectedCases.CaseOfUnexpectedInput;
import com.Agaponov.CalculatorSolution.UnexpectedCases.CaseOfOperationUnknown;
import com.Agaponov.CalculatorSolution.UnexpectedCases.CaseOfFalseOperands;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Calculator {
    private double leftNum;
    private double rightNum;
    private String operator;
    private BinaryOperation action;


    public void calculate() throws CaseOfOperationUnknown {
        action = getOperationFor(operator);
        double result = action.resultFor(leftNum, rightNum);
        System.out.println(leftNum + " " + operator + " " + rightNum + " = " + result);
    }
    // added new signature for test
    public double calculate ( double a, double b, String operation) throws CaseOfOperationUnknown {
        action = getOperationFor(operation);
        double result = action.resultFor(a, b);
        System.out.println(a + " " + operation + " " + b + " = " + result);
        return result;
    }

    public void checkUserInput() throws CaseOfFalseOperands, CaseOfUnexpectedInput {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] calcPos = inputString.split(" ");
        if (calcPos.length == 3) {
            if (calcPos[0].matches("[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?") && calcPos[2].matches("[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?")) {
                leftNum = parseDouble(calcPos[0]);
                rightNum = parseDouble(calcPos[2]);
            } else {
                throw new CaseOfFalseOperands();
            }
            operator = calcPos[1];
        } else throw new CaseOfUnexpectedInput();
    }


    private BinaryOperation getOperationFor(String operator) throws CaseOfOperationUnknown {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Subtraction();
        } else if ("+".equals(operator)) {
            return new Plus();
        } else if ("log".equals(operator)) {
            return new MathLog();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("^".equals(operator)) {
            return new MathPow();
        } else if ("sqrt".equals(operator)) {
            return new SquareRoot();
        } else throw new CaseOfOperationUnknown();
    }


}