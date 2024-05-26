package modul11;

class Jumlah {
    public int tambah(int x, int y) {
        return x + y;
    }

    public int tambah(int x, int y, int z) {
        return x + y + z;
    }

    public int tambah(double phi, int x) {
        return (int) phi + x;
    }

    public static void main(String[] args) {
        Jumlah obj = new Jumlah();
        System.out.println(obj.tambah(2, 5));
        System.out.println(obj.tambah(2, 5, 9));
        System.out.println(obj.tambah(3.14159, 10));
    }
}

