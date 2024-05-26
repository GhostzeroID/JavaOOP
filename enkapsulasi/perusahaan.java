package enkapsulasi;

public class perusahaan {
    private String nPerusahaan;
    private String alamat;
    private pegawai peg;
    public perusahaan(){
        this.nPerusahaan = "PT. Lancar Jaya";
        this.alamat = "YOGYAKARTA";
        this.peg = new pegawai();
        peg.setNama("Reza Wijaya");
        peg.setJabatan("Managger");
        peg.setGaji(12000000);
    } 
    public void cetakPerus(){
        System.out.println("Nama Perusahaan : "+this.nPerusahaan);
        System.out.println("Alamat : "+this.alamat);
        peg.cekPegawai();
    }
}

