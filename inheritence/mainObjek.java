package inheritence;

public class mainObjek {
    public static void main(String[] args) {
        System.out.println("=============BENTUK===============");
        bentuk bentuk = new bentuk("Merah");
        bentuk.printInfo();
        System.out.println("==========BUJUR SANGKAR===========");
        bujurSangkar bujur = new bujurSangkar(10, "Kuning");
        bujur.printInfo();
        System.out.println("============LINGKARAN=============");
        lingkaran lingkaran = new lingkaran(7, "Hijau");
        lingkaran.printInfo();
        System.out.println("=============SILINDER=============");
        silinder sil = new silinder(5, 7, "Biru");
        sil.printInfo();
    }
}

