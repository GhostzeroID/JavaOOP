package enkapsulasi;

public class cekkariawan {
    public static void main(String[] args) {
        pegawai dataPage = new pegawai();
        dataPage.setNama("Reza");
        dataPage.setJabatan("CEO");
        dataPage.setGaji(50000000);
        dataPage.cekPegawai();
    }
}

