package inheritence;

public class silinder extends lingkaran{
    double t;
    silinder(double tinggi, double radius, String warna){
        super(radius, warna);
        this.t = tinggi;
    }
    double getTinggi(){
        return t;
    }
    void setTinggi(double tinggi){
        this.t = tinggi;
    }
    double hitungVolume(){
        double volum = 0;
        volum = 3.14 *(r*r)*getTinggi();
        return volum;
    }
    void printInfo(){
        System.out.println("Warna : "+getWarna());
        System.out.println("Volume : "+hitungVolume());
    }
}

