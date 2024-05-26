package modul11;

class Penggajian {
    double gapok;
    double masa_kerja;
    Penggajian(double g, double mk){
        gapok = g;
        masa_kerja = mk;
    }
    Penggajian(){
        gapok = 0;
        masa_kerja=0;
    }
    Penggajian(double lembur){
        gapok = masa_kerja = lembur;
    }
    double hitung_gaji(){
        return gapok*masa_kerja;
    }
    public static void main(String[] args) {
        Penggajian karyawan1 = new Penggajian(10,15);
        Penggajian karyawan2 = new Penggajian();
        Penggajian karyawan3 = new Penggajian(5);
        double gaji;
        gaji = karyawan1.hitung_gaji();
        System.out.println("Gaji Karyawan 1 : "+gaji);
        gaji = karyawan2.hitung_gaji();
        System.out.println("Gaji Karyawan 2 : "+gaji);
        gaji = karyawan3.hitung_gaji();
        System.out.println("Gaji Karyawan 3 : "+gaji);
    }
}

