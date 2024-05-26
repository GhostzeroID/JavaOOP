package modul4;

public class classBuku {
   private String judul;
    private int harga;
    private int halaman;

   public String getJudul(){
    return judul;
   }
   public void setJudul(String judul){
    this.judul = judul;
   }
   public int getharga(){
    return harga;
   }
   public void setHarga(int harga){
    this.harga = harga;
   }
   public int getHalaman(){
    return halaman;
   }
   public void setHalaman(int halaman){
    this.halaman = halaman;
   }
    void TampilkanBuku(){
        System.out.println("Data Buku");
        System.out.println("Judul Buku : "+this.judul);
        System.out.println("Harga Buku : "+this.harga);
        System.out.println("Halaman Buku : "+this.halaman);
    }
    public static void main(String[] args) {
        classBuku buku1 = new classBuku();
        buku1.setJudul("Belajar Bahasa Java");
        buku1.setHalaman(250);
        buku1.setHarga(200000);
        buku1.TampilkanBuku();

    }
}



