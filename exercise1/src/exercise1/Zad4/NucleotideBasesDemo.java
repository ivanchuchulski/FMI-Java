package exercise1.Zad4;

import java.util.Scanner;

public class NucleotideBasesDemo {
    public static void main(String[] args) {
        int inputNumber;
        NucleotideBases nucleotideBases = new NucleotideBases();
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.printf("enter a positive four-digit number : ");
        inputNumber = scanner.nextInt();

        // check if the number exceeds limits
        if (inputNumber < 999 || inputNumber > 10_000) {
            System.out.printf("error : your input is not four-digit%n");
            return;
        }

        nucleotideBases.setNucleotideCode(inputNumber);

        System.out.printf("%s", nucleotideBases.getNucleotideSequence());
    }
}
