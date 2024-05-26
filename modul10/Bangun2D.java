package modul10;

interface Bangun2D {
    double hitungLuas();

    double hitungKeliling();
}
interface Bangun3D {
    void hitungVolume();

    void tampilInfo();
}
interface Pola {
    void setWarna();

    void getWarna();
}
class Lingkaran implements Bangun2D {
    private double jejari;

    public void setJejari(double jejari) {
        this.jejari = jejari;
    }
    public double getJejari() {
        return this.jejari;
    }
    public double hitungLuas() {
        return 3.14 * this.jejari * this.jejari;
    }

    public double hitungKeliling() {
        return 2 * 3.14 * this.jejari;
    }
}
class Tabung extends Lingkaran implements Bangun3D, Pola {
    private double tinggi;

    public Tabung(double tinggi, double jejariAlas) {
        super();
        setJejari(jejariAlas);
        this.tinggi = tinggi;
    }

    public void hitungVolume() {
        double volume = hitungLuas() * tinggi;
        System.out.println("Volume tabung: " + volume);
    }

    public void tampilInfo() {
        System.out.println("Ini adalah objek tabung.");
    }

    public void setWarna() {
        System.out.println("Mengatur ");
    }

    public void getWarna() {
        System.out.println("Mendapatkan warna objek.");
    }

    public double hitungLuasPermukaan() {
        return 2 * hitungLuas() + hitungKeliling() * tinggi;
    }

    public static void main(String[] args) {
        Tabung tabung = new Tabung(8, 9);
        tabung.hitungVolume();
        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
        tabung.setWarna();
        tabung.getWarna();
        tabung.tampilInfo();
    }
}
