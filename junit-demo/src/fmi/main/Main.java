package fmi.main;

import fmi.math.MyMath;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.printf("%f%n", MyMath.product(7, 3));

            System.out.printf("%f%n", MyMath.radiansToDegrees(MyMath.PI));

            System.out.printf("%f%n", MyMath.degreesToRadians(180));

            System.out.printf("%f%n", MyMath.integerPow(4.5, 2));

            System.out.printf("%f%n", MyMath.sqrt(-256));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
