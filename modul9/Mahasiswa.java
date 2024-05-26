package modul9;

abstract class Mahasiswa {
    protected String nama;
    protected int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public abstract void isiBiodata(String pilihanJurusan, String asalSekolah);

    public void registrasi() {
        System.out.println(nama + " telah melakukan registrasi");
    }

    public void testMasuk() {
        System.out.println("Nilai test anda " + nilai);
    }
}

class MahasiswaBaru extends Mahasiswa {

    public MahasiswaBaru(String nama, int nilai) {
        super(nama, nilai);
    }

    @Override
    public void isiBiodata(String pilihanJurusan, String asalSekolah) {
        System.out.println("Biodata Anda: \n" +
                "Nama: " + nama +
                "\nNilai: " + nilai +
                "\nPilihan Jurusan: " + pilihanJurusan +
                "\nAsal Sekolah: " + asalSekolah);
    }

    public static void main(String[] args) {
        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("Reza", 80);
        System.out.println("Nama " + mahasiswaBaru.nama + " nilai : " + mahasiswaBaru.nilai);
        mahasiswaBaru.registrasi();
        mahasiswaBaru.testMasuk();
    }
}

