package exercise1.Zad3;

import java.lang.Math;

public class NumberEncrypter {
    private int originalNumber;
    private int encryptedNumber;

    // constructors
    public NumberEncrypter()
    {
        this.originalNumber = 1000;
        this.encryptedNumber = EncryptNumber(this.originalNumber);
    }

    public NumberEncrypter(int number)
    {
        setOriginalNumber(number);
        encryptedNumber = EncryptNumber(this.originalNumber);
    }

    // setter
    public void setOriginalNumber(int number) {
        if (number <= 999 || number >= 10_000) {
            this.originalNumber = 1000;
        }
        else {
            this.originalNumber = number;
        }
    }

    // getter
    public int getEncryptedNumber() {
        return this.encryptedNumber;
    }

    // enrypting method
    public int EncryptNumber(int number) {
        int encrypted = 0;
        int numberOfDigits = 4;

        // each index in the array is the power of 10 multiplied by that digit in the number
        int digits[] = new int[numberOfDigits];
        int encryptedDigits[] = new int[numberOfDigits];

        // building the digits array
        int index = 0;
        while (number != 0)
        {
            digits[index++] = number % 10;
            number /= 10;
        }

        // encryption of the digits
        for (int i = 0; i < numberOfDigits; i++) {
            encryptedDigits[i] = (digits[i] + 7) % 10;
        }

        for (int i = 0; i < numberOfDigits - 2; i++) {
            int temp = encryptedDigits[i];
            encryptedDigits[i] = encryptedDigits[i + 2];
            encryptedDigits[i + 2] = temp;
        }

        // assigning to the number
        for (int i = 0; i < numberOfDigits; i++) {
            encrypted += encryptedDigits[i] *  (int)Math.pow(10, i);
        }

        return encrypted;
    }
}
