package exercise1.Zad3;

import java.util.Scanner;

public class EncryptionDemo {
    public static void main(String[] args) {
        int userNumber;
        int encryptedNumber;
        int decryptedNumber;
        NumberEncrypter encrypter = null;
        NumberDecrypter decrypter = null;
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.printf("Enter a positive four-digit number : ");
        userNumber = scanner.nextInt();

        // check if number exceeds limits
        if (userNumber <= 999 || userNumber >= 10_000) {
            System.out.println("error : your number is not positive four-digit");
            return;
        }

        encrypter = new NumberEncrypter(userNumber);
        encryptedNumber = encrypter.getEncryptedNumber();

        decrypter = new NumberDecrypter(encryptedNumber);
        decryptedNumber = decrypter.getDecryptedNumber();

        // output
        System.out.printf("encrypted number : %04d%n",  encryptedNumber);
        System.out.printf("decrypted number : %04d%n",  decryptedNumber);
    }
}