package task4BoxCalculator.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Сумма
        List<Integer> intArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Sum of integers: " + calculator.sum(intArray));

        List<Double> doubleArray = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5));
        System.out.println("Sum of doubles: " + calculator.sum(doubleArray));

        // Умножение
        System.out.println("Product of integers: " + calculator.multiply(intArray));
        System.out.println("Product of doubles: " + calculator.multiply(doubleArray));

        // Деление
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        System.out.println("Division result: " + calculator.divide(dividend, divisor));

        // Бинарное представление
        System.out.print("Enter a number to convert to binary: ");
        String input = scanner.next();
        double number = calculator.parseStringToNumber(input);
        System.out.println("Binary representation: " + calculator.toBinaryString(number));

        scanner.close();
    }
}
