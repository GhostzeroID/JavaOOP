package tugasmateri;

import java.util.Random;
import java.util.Scanner;

public class GameTebakAngka {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Random untuk menghasilkan angka acak
        Random random = new Random();
        int angkaTebakan = random.nextInt(10) + 1; // Angka acak antara 1 dan 10

        // Memulai game
        System.out.println("Selamat datang di Game Tebak Angka!");
        System.out.println("Tebak angka antara 1 dan 10.");

        boolean tebakanBenar = false;

        do {
            try {
                // Minta pengguna untuk menebak angka
                System.out.print("Masukkan tebakan Anda: ");
                int tebakan = scanner.nextInt();

                // Memeriksa apakah tebakan benar
                if (tebakan == angkaTebakan) {
                    tebakanBenar = true;
                    System.out.println("Selamat! Anda menebak dengan benar.");
                } else if (tebakan < 1 || tebakan > 10) {
                    System.out.println("Mohon masukkan angka antara 1 dan 10.");
                } else if (tebakan < angkaTebakan) {
                    System.out.println("Tebakan terlalu kecil. Coba lagi!");
                } else {
                    System.out.println("Tebakan terlalu besar. Coba lagi!");
                }
            } catch (Exception e) {
                // Tangkap exception jika input bukan angka
                System.out.println("Mohon masukkan angka yang valid.");
                scanner.next(); // Membersihkan buffer input
            }

        } while (!tebakanBenar);

        // Menutup scanner setelah digunakan
        scanner.close();
    }
}
