package modul8;

public class TesMobil {
    public static void main(String[] args) {
        System.out.println("Mrupakan pemanggilan objek Mobil");
        Mobil avanza = new Mobil(10, "Avanza");
        avanza.PrintInfoMobil();
        System.out.println(" ");
        System.out.println("Merupakan pemanggilan object Mobil");
        Truck truk = new Truck(7, "Tronton", "Kapasitas 10 Ton");
        truk.PrintInfoMobil();
        truk.PrintInfoTruck();

        System.out.println("");
        System.out.println("Mrupakaan pemanggilan object Mobil");
        Bus bus = new Bus("King Long", 80, "Bus Kota");
        bus.PrintInfoMobil();
        bus.PrintInfoBus();
    }
}

