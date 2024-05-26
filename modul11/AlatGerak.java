package modul11;

class AlatGerak {
    void bergerak() {
        System.out.println("Saya mampu bergerak");
    }
}
class Sayap extends AlatGerak {
    void bergerak() {
        System.out.println("Saya Mampu Terbang");
    }
}
class Kaki extends AlatGerak {
    void bergerak() {
        System.out.println("Saya bisa berjalan");
    }
}
class Burung {
    private AlatGerak alatGerak = new AlatGerak();
    Burung() {
        System.out.println("Hai saya burung");
    }
    public void bergerak() {
        alatGerak.bergerak();
    }
    public void setAlatGerak(AlatGerak alatGerak){
        this.alatGerak = alatGerak;
        System.out.println("Sekarang saya pakai "+ alatGerak);
    }
}
class BurungTest{
    public static void main(String[] args) {
        Burung merpati= new Burung();
        merpati.bergerak();
        Sayap sayap = new Sayap();
        Kaki kaki = new Kaki();
        merpati.setAlatGerak(sayap);
        merpati.bergerak();
        merpati.setAlatGerak(kaki);
        merpati.bergerak();
    }
}



