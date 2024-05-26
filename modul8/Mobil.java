package modul8;

public class Mobil {
    protected int kecmaks;
    protected String namaken;

    public Mobil(){
        System.out.println("Konstruktor Mobil");
    }
    public Mobil(int kecmaks){
        this.kecmaks = kecmaks;
        System.out.println("Kecepatan Maksimal Mobil = "+kecmaks);
    }
    Mobil(int kecmaks, String namaken){
        this.kecmaks = kecmaks;
        this.namaken = namaken;
    }
    public void PrintInfoMobil(){
        System.out.println("Kecepatan Maksumal : "+kecmaks);
        System.out.println("Nama Kendaraan : "+namaken);
    }
}



