package exercise1.Zad2;

public class PalindromicNumber {
    private boolean isPalindromic;
    private int number;

    // constructors
    public PalindromicNumber() {
        number = 12521;
        this.isPalindromic = isPalindrome(this.number);
    }

    public PalindromicNumber(int number) {
        this.number = number;
        this.isPalindromic = isPalindrome(this.number);
    }

    // setter
    public void setNumber(int number) {
        this.number = number;
        setIsPalindromic(this.number);
    }

    // getters
    public int getNumber() {
        return this.number;
    }

    public boolean getIsPalindromic() {
        return this.isPalindromic;
    }

    // helper methods
    private boolean isPalindrome(int number) {
        int numberOfDigits = getNumberOfDigits(number);
        int digitsArray[] = new int[numberOfDigits];

        int index = 0;
        while (number != 0)
        {
            int remainder = number % 10;
            digitsArray[index++] = remainder;
            number /= 10;
        }

        // palindrome check
        for (int i = 0; i < digitsArray.length / 2; i++) {
            if (digitsArray[i] != digitsArray[digitsArray.length - i - 1]) {
                return false;
            }
        }

        // in case loop finished, then the number is palindromic
        return true;
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

    // private setter to ensure consistency with the value of number, i.e. this value should not be changed publicly
    private void setIsPalindromic(int number) {
        this.isPalindromic = isPalindrome(number);
    }
}
