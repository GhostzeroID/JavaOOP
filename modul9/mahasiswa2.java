package modul9;

public class mahasiswa2 extends manusia {
    private String nim;

    public mahasiswa2(String nama, int umur, String nim) {
        super(nama, umur);
        this.nim = nim;
    }

    // Tambahan metode khusus Mahasiswa jika diperlukan

    public String getNim() {
        return nim;
    }
}


