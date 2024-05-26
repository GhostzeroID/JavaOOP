package responsi;

public class SegiTiga {
    protected double alas;
    protected double tinggi;

    public SegiTiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void tampilkanInformasi() {
        System.out.println("Segitiga dengan alas = " + alas + " dan tinggi = " + tinggi);
    }
}

class PrismaSegiTiga extends SegiTiga {
    private double tinggiPrisma;

    public PrismaSegiTiga(double alas, double tinggi, double tinggiPrisma) {
        super(alas, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggiPrisma;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Tinggi Prisma = " + tinggiPrisma);
    }

    public static void main(String[] args) {
        SegiTiga segiTiga = new SegiTiga(27, 34);
        segiTiga.tampilkanInformasi();
        System.out.println("Luas Segitiga = " + segiTiga.hitungLuas());

        System.out.println();

        PrismaSegiTiga prismaSegiTiga = new PrismaSegiTiga(17, 34, 50);
        prismaSegiTiga.tampilkanInformasi();
        System.out.println("Volume Prisma Segitiga = " + prismaSegiTiga.hitungVolume());
    }
}

