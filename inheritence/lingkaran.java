package inheritence;

public class lingkaran extends bentuk {
    double r;
    lingkaran(double radius, String warna){
        super(warna);
        this.r = radius;
    }
    double getRadius(){
        return r;
    }
    void setRadius(double radius){
        this.r = radius;
    }
    double hitungLuas(){
        double luas = 0;
        luas = 3.14 * this.getRadius() * this.getRadius();
        return luas; 
    }
    void printInfo(){
        System.out.println("Warna : "+getWarna());
        System.out.println("Luas : "+hitungLuas());
    }
}

