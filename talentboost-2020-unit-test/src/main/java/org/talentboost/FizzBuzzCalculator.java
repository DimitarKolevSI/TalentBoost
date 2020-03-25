package org.talentboost;

public class FizzBuzzCalculator implements NumberCalculator {
    private static final int FIVE = 5;
    private static final int THREE = 3;

    @Override
    public String calculate(int number) {

        if (isDivisibleBy(number, THREE) && isDivisibleBy(number, FIVE)) {
            return "FizzBuzz";
        }

        if (isDivisibleBy(number, THREE)) {
            return "Fizz";
        }

        if (isDivisibleBy(number, FIVE)) {
            return "Buzz";
        }

        throw new UnsupportedOperationException();
    }

    @Override
    public String calculate(String prefix, int number) {
        return String.format("%1$s%2$s", prefix, calculate(number));
    }

    private boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
