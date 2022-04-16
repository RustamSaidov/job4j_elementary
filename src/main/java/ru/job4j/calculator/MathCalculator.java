package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }
    public static double substractionAndDivision(double first, double second) {
        return substraction(first, second)
                + division(first, second);
    }
    public static double sumMultiplySubstractionDivision(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + substraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы сложения и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы вычитания и деления равен: " + substractionAndDivision(10, 20));
        System.out.println("Результат расчета суммы сложения, умножения, вычитания и деления равен: " + sumMultiplySubstractionDivision(10, 20));
    }
}