package task4BoxCalculator.calculator;

import java.util.List;

public class Calculator {

    public double sum(List<? extends Number> array) {
        double result = 0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        return result;
    }

    public double multiply(List<? extends Number> array) {
        double result = 1;
        for (Number num : array) {
            result *= num.doubleValue();
        }
        return result;
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return dividend / divisor;
    }

    public String toBinaryString(double number) {
        int integerValue = (int) number;
        String binaryInteger = Integer.toBinaryString(integerValue);
        double fractionalPart = number - integerValue;

        StringBuilder binaryFractional = new StringBuilder();
        while (fractionalPart != 0) {
            if (binaryFractional.length() > 32) {
                throw new IllegalArgumentException("Fractional part cannot be represented accurately.");
            }
            fractionalPart *= 2;
            int bit = (int) fractionalPart;
            binaryFractional.append(bit);
            fractionalPart -= bit;
        }
        return binaryInteger + "." + binaryFractional.toString();
    }

    public double parseStringToNumber(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Cannot parse string to number: " + str);
        }
    }
}
