package modul5;

public class tesFilm {
    public static void main(String[] args) {
        film film1 = new film();
        film1.setFilm("Warkop DKI", "Komedi", 120);
        System.out.println("Judul film : " + film1.judul);
        System.out.println("Jenis film : " + film1.jenis);
        System.out.println("durasi : " + film1.durasi);
    }
}

