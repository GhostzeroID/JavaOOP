package inheritence;

public class bujurSangkar extends bentuk {
    double s;
    bujurSangkar(double sisi, String warna){
        super(warna);
        this.s = sisi;
    }
    double getSegi(){
        return s;
    }
    void setSisi(double sisi){
        this.s = sisi;
    }
    double hitungLuas(){
        double luas = 0;
        luas = getSegi()* this.s;
        return luas;
    }
    void printInfo(){
        System.out.println("warna : "+getWarna());
        System.out.println("Luas : "+hitungLuas());
    }
}

