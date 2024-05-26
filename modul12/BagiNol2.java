package modul12;

public class BagiNol2 {
    public static void main(String[] args) {
        System.out.println("Sebelum Pembagian");
        try { System.out.println(5/0);}
        catch (Exception t){
            System.out.println("Pesan Kesalahan : ");
            System.out.println(t.getMessage());
        }
        System.out.println("Sesudah pembagian");
    }
}

