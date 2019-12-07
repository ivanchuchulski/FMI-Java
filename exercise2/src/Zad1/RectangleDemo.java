package Zad1;

import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        int height;
        int width;
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("enter rectangle height : ");
        height = scanner.nextInt();

        System.out.printf("enter rectangle width : ");
        width = scanner.nextInt();

        rectangle.setHeight(height);
        rectangle.setWidth(width);

        System.out.printf("rectangle perimeter : %.4f%n", rectangle.getPerimeter());
        System.out.printf("rectangle area : %.4f%n", rectangle.getArea());
    }
}
