package uts;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int bil;
        int bilPositif = 0;
        int bilNegatif = 0;
        int total      = 0;
        int jumlah     = 0;

        System.out.println("Masukkan bilangan integer (program akan berhenti jika memasukkan 0): ");

        do {
            bil = userInput.nextInt();

            if (bil > 0) {
                bilPositif++;
            } else if (bil < 0) {
                bilNegatif++;
            }

            total += bil;
            jumlah++;
            
        } while (bil != 0);

        if (jumlah == 1) {
            System.out.println("Tidak ada bilangan yang dimasukkan kecuali 0");
        } else {
            double rataRata = (double) total / (jumlah - 1);
            System.out.println("Jumlah bilangan positif adalah " + bilPositif);
            System.out.println("Jumlah bilangan negatif adalah " + bilNegatif);
            System.out.println("Nilai total     : " + total);
            System.out.println("Nilai rata-rata : " + rataRata);
        }

        userInput.close();
    }
}
