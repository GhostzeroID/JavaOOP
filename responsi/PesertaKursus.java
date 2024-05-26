package responsi;

public class PesertaKursus {
    private String nama;
    private String noId;
    private String alamat;
    private String tglLahir;
    private String jenisKelamin;
    private String noHp;
    private String jenisKursus;

    public PesertaKursus(String nama, String noId, String alamat, String tglLahir, String jenisKelamin, String noHp,
            String jenisKursus) {
        this.nama = nama;
        this.noId = noId;
        this.alamat = alamat;
        this.tglLahir = tglLahir;
        this.jenisKelamin = jenisKelamin;
        this.noHp = noHp;
        this.jenisKursus = jenisKursus;
    }

    public void tampilkanDataPeserta() {
        System.out.println("Data Peserta Kursus:");
        System.out.println("Nama: " + nama);
        System.out.println("No. ID: " + noId);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tanggal Lahir: " + tglLahir);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No. HP: " + noHp);
        System.out.println("Jenis Kursus: " + jenisKursus);
    }

    public static void main(String[] args) {
        PesertaKursus peserta = new PesertaKursus("Ahmad Reza", "22561","Jl. Kuta Lombok", "09-06-2004", "Laki-laki",
                "082359181864", "Kursus Java");
        peserta.tampilkanDataPeserta();
    }
}

