
package markahexam;

import java.util.Scanner;

public class MarkahExam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double purata = 0;
        double[] markah = new double[5];
        int i;
        int ujian;
        double jumlah = 0;

        System.out.print("Peperiksaan/ujian kali ke(1/2/3): ");
        ujian = input.nextInt();

        for (i = 0; i < 5; i++) {
            System.out.print("Masukkan markah ke-" + (i + 1) + ": ");
            markah[i] = input.nextDouble();
            jumlah += markah[i]; // Calculate the sum of marks
        }

        System.out.println("5 Markah yang dimasukkan ialah:");
        for (i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + markah[i]);
        }

        System.out.println("\nHasil tambah 5 Markah: " + jumlah);

        purata = jumlah / 5; // Calculate the average
        System.out.println("Purata: " + purata);

        int Bilangan = 0;
        for (i = 0; i < 5; i++) {
            if (markah[i] > purata) {
                Bilangan++;
            }
        }
        System.out.println("Bilangan Markah melebihi Purata: " + Bilangan);
    }
}


  
