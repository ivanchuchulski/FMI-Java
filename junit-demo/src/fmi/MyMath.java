package fmi;

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

    public static double integerPow(double x, int n) {
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                n = -(n + 1);
                return 1.0 / (integerPow(x*x, n));
            }
            n = n*(-1);
            return (double)1.0 / integerPow(x, n);
        }
        double y = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                x = x*x;
            }
            else {
                y = y*x;
                x = x*x;
            }
            n = n/2;
        }
        return y;
    }

    public static double radiansToDegrees(double radians) {
        return radians * 180 / PI;
    }

    public static double degreesToRadians(double degrees) {
        return degrees * PI / 180;
    }

}
