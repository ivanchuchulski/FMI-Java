package exercise1.Zad1;

import java.util.Scanner;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        int conversionChoice;
        double temperatureValue;
        Thermometer thermometer = new Thermometer();
        Scanner scanner = new Scanner(System.in);

        // temperature input
        System.out.print("enter temperature measurement : ");

        temperatureValue = scanner.nextDouble();

        thermometer.setMeasurement(temperatureValue);

        // choice for conversion
        System.out.printf("please enter a choice for temperature conversion%n");
        System.out.printf("enter 1 for fahrenheit to celsius%n");
        System.out.printf("enter 2 for celsius to fahrenheit%n");
        System.out.printf("your choice : ");

        conversionChoice = scanner.nextInt();

        if (conversionChoice == 1) {
                System.out.printf("fahrenheit to celsius : %.2f%n", thermometer.convertToCelsius());
        }
        else if (conversionChoice == 2 ) {
                System.out.printf("celsius to fahrenheit : %.2f%n", thermometer.convertToFahrenheit());
        }
        else {
            System.out.printf("error : wrong choice%n");
        }
    }
}
