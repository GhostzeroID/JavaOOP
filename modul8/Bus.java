package modul8;

public class Bus extends Mobil{
    protected String Jenis;

    public Bus(String Jenis){
        this.Jenis = Jenis;
        System.out.println(Jenis);
    }
    public Bus(String namaken, int kecmaks, String Jenis){
        super(kecmaks, namaken);
        this.Jenis = Jenis;
    }
    @Override
    public void PrintInfoMobil(){
        super.PrintInfoMobil();
        System.out.println("Jenis Bus : "+Jenis);
    }
    public void PrintInfoBus(){
        System.out.println("Kecepatan maksimal : "+kecmaks);
        System.out.println("Nama Kendaraan : "+namaken);
        System.out.println("Jenis Bus : "+Jenis);
    }
}

