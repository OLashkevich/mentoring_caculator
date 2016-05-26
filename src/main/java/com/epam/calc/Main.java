package com.epam.calc;

import java.util.Scanner;

/**
 * @author Olga Lashkevich
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию: + - * /");
        String operationType = scanner.next();
        System.out.print("Введите первое число: ");
        Double number1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        Double number2 = scanner.nextDouble();
        Calculator calculator = new Calculator();
        System.out.print("Результат: " +
                number1 + operationType + number2 + " = " + calculator.calculate(operationType, number1, number2));
    }

}
