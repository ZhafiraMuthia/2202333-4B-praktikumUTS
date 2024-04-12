package uts;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        long number = userInput.nextLong();

        System.out.println("Jumlah digit dalam bilangan " + number + " adalah " + sumDigits(number));

        userInput.close();
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            int digit = (int) (n % 10);
            sum += digit;
            n /= 10;
        }

        return sum;
    }
}
