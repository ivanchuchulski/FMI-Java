package fmi.main;

import fmi.MyMath;

public class Main {
    public static void main(String[] args) {

        System.out.printf("%f%n", MyMath.product(7, 3));

        System.out.printf("%f%n", MyMath.radiansToDegrees(MyMath.PI));

        System.out.printf("%f%n", MyMath.degreesToRadians(180));

        System.out.printf("%f%n", MyMath.degreesToRadians(180));

        System.out.printf("%f%n", MyMath.integerPow(4.5,2));
    }
}
