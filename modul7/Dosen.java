public class Dosen extends Manusia{
    private String IdDosen;
    private String MataKuliah;

    public Dosen(){
        nama="Sutejo S.com";
        umur=47;
        this.IdDosen ="092564";
        this.MataKuliah="Statistika";
    }
    public void cetak(){
        System.out.println("====DATA DOSEN====");
        System.out.println("ID Dosen : "+IdDosen);
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("Mata Kuliah : "+MataKuliah);
    }

    public static void main(String[] args) {
        Dosen dosen1=new Dosen();
        dosen1.cetak();
    }
}

