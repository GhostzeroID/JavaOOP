package modul4;

public class komputer {
    boolean power = false;
    int x, y;
    int hasil = 0;
    String file;

    komputer(boolean power) {
        this.power = false;
        System.out.println("Status: " + (power ? "Menyala" : "Mati"));
    }

    public void tombolHidup() {
        System.out.println("Komputer hidup ! ");
        System.out.println("Buka aplikasi");
        power = true;
    }

    public void tombolMati() {
        if (power) {
            System.out.println("Komputer mati ! ");
            power = false;
        }
    }

    public void kalkulator() {
        System.out.println("aplikasi Kalkulator di buka");
    }

    public void kali(int x, int y) {
        hasil = x * y;
        System.out.println("Hasil : "+hasil);
    }

    public void bagi(int x, int y) {
        hasil = x / y;
        System.out.println("Hasil : "+hasil);
    }

    public void tambah(int x, int y) {
        hasil = x + y;
        System.out.println("Hasil : "+hasil);
    }

    public void kurang(int x, int y) {
        hasil = x - y;
        System.out.println("Hasil : "+hasil);
    }

    public void MicWorld() {
        System.out.println("Aplikasi Microsoft World di buka");
    }

    public void Ketik(String file) {
        this.file = file;
        System.out.println("Hasil mengetik : " + file);
    }

    public static void main(String[] args) {
        komputer komputer1 = new komputer(true);
        komputer1.kalkulator();
        komputer1.bagi(10, 2);
        System.out.println("================");
        komputer komputer2 = new komputer(true);
        komputer2.MicWorld();
        komputer2.Ketik("hallo guys my name is Reza, semoga di semogain ckckc");
        System.out.println("================");
    }

}


