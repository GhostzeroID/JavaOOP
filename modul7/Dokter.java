public class Dokter extends Manusia{
    private String idDokter;
    private String jenjang;

    public Dokter(){
        nama="M.sutarjo M.D";
        umur=45;
        this.idDokter="D1004";
        this.jenjang="OSCE";
    }
    public void cetak(){
        System.out.println("====Data Dokter====");
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("ID Dokter : "+idDokter);
        System.out.println("Jenjang : "+jenjang);
    }
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter();
        dokter1.cetak();
        System.out.println();
        System.out.println();
    }
}


