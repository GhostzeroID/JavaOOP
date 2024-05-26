package modul123;
public class Mahasiswa {
    private String nim, nama;

    // method mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // method acessor
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void TampilkanData() {
        System.out.println("==Data==");
        System.out.println("Nim : " + getNim());
        System.out.println("Nama : " + getNama());
    }

    public static void main(String[] args) {
        Mahasiswa Obj = new Mahasiswa();
        Obj.setNim("225610005");
        Obj.setNama("Ahmad Reza");
        Obj.TampilkanData();
    }
}


