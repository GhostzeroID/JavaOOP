package modul9;

abstract class bentuk {
    protected int panjang;
    protected int lebar;

    public String getBentuk() {
        return "bentuk dasar";
    }

    public abstract int HitungLuas();
}

class BujurSangkar extends bentuk {

    public BujurSangkar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public String getBentuk() {
        return "bentuk bujur sangkar";
    }

    @Override
    public int HitungLuas() {
        return panjang * lebar;
    }
}

class Segitiga extends bentuk {

    public Segitiga(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public String getBentuk() {
        return "bentuk segitiga";
    }

    @Override
    public int HitungLuas() {
        return (panjang * lebar) / 2;
    }
}

class TesAbstrak2 {
    public static void cetakLuasBentuk(bentuk btk) {
        System.out.println(btk.getBentuk() + " dengan luas: " + btk.HitungLuas());
    }

    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar(10, 20);
        Segitiga st = new Segitiga(5, 10);
        cetakLuasBentuk(bs);
        cetakLuasBentuk(st);
    }
}

