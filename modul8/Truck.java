package modul8;

public class Truck extends Mobil{
    protected String speksifikasi;

    public Truck(String speksifikasi, int kec){
        this.speksifikasi = speksifikasi;
        System.out.println(speksifikasi);
    }
    public Truck(int kecmaks, String namaken, String speksifikasi){
        super(kecmaks, namaken);
        this.speksifikasi = speksifikasi;
    }
    @Override
    public void PrintInfoMobil(){
        super.PrintInfoMobil();
        System.out.println("Gandengan : "+speksifikasi);
    }
    public void PrintInfoTruck(){
        System.out.println("Kecepatan maksimal : "+kecmaks);
        System.out.println("Nama Kendaraan : "+namaken);
        System.out.println("Speksifikasi : "+speksifikasi);
    }
}

