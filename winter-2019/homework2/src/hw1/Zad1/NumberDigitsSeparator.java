package hw1.Zad1;

public class NumberDigitsSeparator {
    private int digitsArr[];

    public NumberDigitsSeparator(int number) {
        setDigitsArr(number);
    }

    public int getNthDigit(int n) {
        return digitsArr[n];
    }

    public void setDigitsArr(int number) {
        int numberOfDigits = getNumberOfDigits(number);

        digitsArr = new int[numberOfDigits];

        int index = 0;
        while (number != 0)
        {
            int remainder = number % 10;
            digitsArr[index++] = remainder;
            number /= 10;
        }
    }

    public boolean digitMeetsCriteria(int nthDigit, int lowerBound, int upperBound) {
        return (getNthDigit(nthDigit) >= lowerBound && getNthDigit(nthDigit) <= upperBound);
    }

    private int getNumberOfDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int numberOfDigits = 0;

        while (number != 0)
        {
            numberOfDigits++;
            number /= 10;
        }

        return numberOfDigits;
    }


}
