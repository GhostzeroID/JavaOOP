package modul4;

public class Pegawai {
    String NamaPegawai, PosisiPegawai;
    int IdPegawai;

    Pegawai(String nama, int Id, String Posisi) {
        NamaPegawai = nama;
        IdPegawai = Id;
        PosisiPegawai = Posisi;
    }

    Pegawai() {
        NamaPegawai = "Reza";
        IdPegawai = 22561;
        PosisiPegawai = "Staf Manager";
    }

    void show() {
        System.out.println("Informasi Pegawai");
        System.out.println("Nama   : " + NamaPegawai);
        System.out.println("Id     : " + IdPegawai);
        System.out.println("Posisi : " + PosisiPegawai);
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai("Rizki", 33674, "Staf Manajemen");
        pegawai1.show();
        pegawai2.show();
    }
}



