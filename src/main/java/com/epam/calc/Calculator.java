package com.epam.calc;

import java.math.BigDecimal;

/**
 * @author Olga Lashkevich
 */
public class Calculator {

    public double calculate(String operationType, double number1, double number2) {

        double result = 0;
        switch (operationType) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number1;
                break;
            case "/":
                result = number1 / number2;
                BigDecimal bigDecimal = new BigDecimal(result);
                result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                break;
            default:
                throw new RuntimeException("Unsupported operation: " + operationType);
        }
        return result;
    }

}
