package mahasiswa;

public class paket {
    String nama;
    int umur;

    public void isiPaket() {
        System.out.println("Ini Adalah Hasil IMport");
    }

    public void setData(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}

