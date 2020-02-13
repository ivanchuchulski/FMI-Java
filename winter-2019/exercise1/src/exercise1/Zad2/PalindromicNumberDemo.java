package exercise1.Zad2;

import java.util.Scanner;

public class PalindromicNumberDemo {
    public static void main(String[] args) {
        int userInput;
        String resultString = null;
        PalindromicNumber palindromicNumber = null;
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.printf("enter a positive five-digit number : ");
        userInput = scanner.nextInt();

        // check if number exceeds limits
        if (userInput <= 9999 || userInput >= 100_000) {
            System.out.println("error : your number is not five-digit");
            return;
        }

        palindromicNumber = new PalindromicNumber(userInput);

        // assigning to resultString
        if (palindromicNumber.getIsPalindromic()) {
            resultString =  "number is palindrome";
        }
        else {
            resultString = "number is not palindrome";
        }

        // output
        System.out.printf(resultString);
    }

}
