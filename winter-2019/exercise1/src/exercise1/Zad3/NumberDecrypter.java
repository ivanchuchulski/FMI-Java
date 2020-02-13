package exercise1.Zad3;

import java.lang.Math;

public class NumberDecrypter {
    private int originalNumber;
    private int decryptedNumber;

    // constructors
    public NumberDecrypter()
    {
        this.originalNumber = 189;
        this.decryptedNumber = DecryptNumber(this.originalNumber);
    }

    public NumberDecrypter(int number)
    {
        setOriginalNumber(number);
        this.decryptedNumber = DecryptNumber(this.originalNumber);
    }

    // setter
    public void setOriginalNumber(int number) {
            this.originalNumber = number;
    }

    // getter
    public int getDecryptedNumber() {
        return this.decryptedNumber;
    }

    // decrypting method
    public int DecryptNumber(int encryptedNumber) {
        int decrypted = 0;
        int numberOfDigits = 4;

        // each index in the array is the power of 10 multiplied by that digit in the number
        int digits[] = new int[numberOfDigits];
        int decryptedDigits[] = new int[numberOfDigits];

        // building the digits array
        int index = 0;
        while (encryptedNumber != 0)
        {
            digits[index++] = encryptedNumber % 10;
            encryptedNumber /= 10;
        }

        // decryption of the digits
        // first reswapping the values
        for (int i = 0; i < numberOfDigits - 2; i++) {
            int temp = digits[i];
            digits[i] = digits[i + 2];
            digits[i + 2] = temp;
        }

        // undoing the addition and swapping
        for (int i = 0; i < numberOfDigits; i++) {
            if (digits[i] > 7 && digits[i] < 10) {
                decryptedDigits[i] = digits[i] % 7;
            }
            else {
                decryptedDigits[i] = (digits[i] % 7) + (10 - 7);
            }
        }

        // assigning to the number
        for (int i = 0; i < numberOfDigits; i++) {
            decrypted += decryptedDigits[i] *  (int)Math.pow(10, i);
        }

        return decrypted;
    }
}
