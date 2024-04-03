package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Программа представляет собой консольный калькулятор, который выполняет основные математические операции.
 */
public class Calculator {

    /**
     * Точка входа в программу. Запрашивает два числа и операцию, а затем выводит результат.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        try {
            System.out.println("Введите первое число:");
            num1 = scanner.nextDouble();

            System.out.println("Введите второе число:");
            num2 = scanner.nextDouble();

            System.out.println("Выберите операцию (+, -, *, /):");
            operator = scanner.next();

            double result = calculate(num1, num2, operator);
            System.out.println("Результат: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение!");
        }
    }

    /**
     * Выполняем математические операции над двумя числами в соответствии с указанным оператором.
     *
     * @param num1     Первое число.
     * @param num2     Второе число.
     * @param operator Оператор (+, -, *, /).
     * @return Результат операции.
     */
    public static double calculate(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("Ошибка: деление на ноль!");
                }
                break;
            default:
                throw new IllegalArgumentException("Ошибка: неверный оператор!");
        }
        return result;
    }
}
