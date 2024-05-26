package modul11;

public class Kendaraan {
    public void info() {
        System.out.println("Info pada Kendaraan");
    }
}

class Roda2 extends Kendaraan {
    public void info() {
        System.out.println("Info pada Roda2");
    }
}

class Motor extends Roda2 {
    public void info() {
        System.out.println("Info Pada Motor");
    }
}

class Test {
    public static void main(String[] args) {
        Roda2 roda2ku;
        Motor motorku;
        Kendaraan k = new Kendaraan();
        roda2ku = new Roda2();
        motorku = new Motor();
        k.info();
        k = roda2ku;
        k.info();
        k = motorku;
        k.info();
    }
}


