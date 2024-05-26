package enkapsulasi;

public class motor {
    private String id;
    private String merk;
    private int harga;
    private int noSeri;
    private String warna;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getSeri(){
        return noSeri;
    }
    public void setSeri(int noSeri){
        this.noSeri = noSeri;
    }
    public void info(){
        System.out.println("Merk Motor : "+this.merk);
        System.out.println("Warna Motor : "+this.warna);
        System.out.println("Nomor Seri : "+this.noSeri);
        System.out.println("Nomor Id : "+this.id);
        System.out.println("Harga : "+this.harga);
    }
}
