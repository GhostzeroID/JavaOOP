package modul5;
import java.util.Scanner;
public class jumlah{
    private static String jumlahGaji;

    public static void main(String[] args) {
        try (Scanner masuk = new Scanner(System.in)) {
            String nama;
            System.out.print("Nama : ");
            nama = masuk.nextLine();
            System.out.print("Gaki Pokok : ");
            System.out.print("Tunjangan : ");
            System.out.println("Nama : "+nama);
        }
        System.out.println("Jumlah Gaji : "+jumlahGaji);
    }
}

