package fmi.math;

public class MyMath {
    public static final double PI = 3.14159;
    public static final double EULER = 2.71828;

    public static double sum(double left, double right)
    {
        return left + right;
    }

    public static double product(double left, double right)
    {
        return left * right;
    }

    public static double abs(double value)
    {
        return value > 0 ? value : -value;
    }

    public static double integerPow(double value, int power) {
        if (power < 0) {
            if (power == Integer.MIN_VALUE) {
                power = -(power + 1);
                return 1.0 / (integerPow(value*value, power));
            }
            power = power*(-1);
            return (double)1.0 / integerPow(value, power);
        }
        double y = 1;
        while (power > 0) {
            if (power % 2 == 0) {
                value = value*value;
            }
            else {
                y = y*value;
                value = value*value;
            }
            power = power/2;
        }
        return y;
    }

    public static double sqrt(double value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("sqrt of negative numbers not defined in reals");
        }

        if (value == 0) {
            return 0;
        }

        double last = 0.0;
        double result = 1.0;
        while (result != last) {
            last = result;
            result = (result + value / result) / 2;
        }
        return result;
    }

    public static double radiansToDegrees(double radians) {
        return radians * 180 / PI;
    }

    public static double degreesToRadians(double degrees) {
        return degrees * PI / 180;
    }

}
