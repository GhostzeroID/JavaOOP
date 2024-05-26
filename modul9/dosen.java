package modul9;

public class dosen extends manusia {
    private String nidn;

    public dosen(String nama, int umur, String nidn) {
        super(nama, umur);
        this.nidn = nidn;
    }
    public String getNidn() {
        return nidn;
    }
}

