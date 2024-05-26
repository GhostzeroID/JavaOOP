package modul9;

public class objek {
    public static void main(String[] args) {
        mahasiswa2 mahasiswa = new mahasiswa2("Reza", 20, "225610005");
        System.out.println("Data Mahasiswa: " + mahasiswa.deskripsi() + ", NIM: " + mahasiswa.getNim());

        dosen dosen = new dosen("Dr.Reza", 20, "225671");
        System.out.println("Data Dosen: " + dosen.deskripsi() + ", NIDN: " + dosen.getNidn());
    }

}

