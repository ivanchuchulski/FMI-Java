package hw1.Zad1;

import java.util.Scanner;

public class NumberDigitsProbabilityTest {
    public static void main(String[] args) {

        int count = 0;
        for (int num = 10_000; num <= 99_999; num++) {
            if (numberMeetsCriteria(num) && (num % 12 == 0)) {
                count++;
            }
        }

        System.out.printf("#numbers meeting criteria : %d", count);
    }

    public static boolean numberMeetsCriteria(int userNumber) {
        int firstDigitIndex = 4;
        int secondDigitIndex = 3;
        int thirdDigitIndex = 2;
        int fourthDigitIndex = 1;
        int fifthDigitIndex = 0;
        NumberDigitsSeparator digits = new NumberDigitsSeparator(userNumber);

        if (digits.digitMeetsCriteria(firstDigitIndex, 3, 9)) {
        //    System.out.println("error : third digit doesn't meet criteria");
            return true;
        }
        else if (digits.digitMeetsCriteria(secondDigitIndex, 2, 8)) {
            //   System.out.println("error : second digit doesn't meet criteria");
            return true;
        }
        else if (digits.digitMeetsCriteria(thirdDigitIndex, 4, 9)) {
            //    System.out.println("error : third digit doesn't meet criteria");
            return true;
        }
        else if (digits.digitMeetsCriteria(fourthDigitIndex, 1, 6)) {
            //   System.out.println("error : fourth digit doesn't meet criteria");
            return true;
        } else if (digits.digitMeetsCriteria(fifthDigitIndex, 6, 9)) {
            //   System.out.println("error : fifth digit doesn't meet criteria");
            return true;
        } else {
            return false;
        }
    }
}
