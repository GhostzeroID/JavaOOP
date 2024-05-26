package modul9;

public abstract class manusia {
    private String nama;
    private int umur;

    public manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String deskripsi() {
        return "Nama: " + nama + ", Umur: " + umur;
    }
}

