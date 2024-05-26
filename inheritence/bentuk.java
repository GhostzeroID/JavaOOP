package inheritence;

public class bentuk {
    String w;
    bentuk(String warna){
        this.w = warna;
    }
    String getWarna(){
        return this.w;
    }
    void setWarna(String warna){

    }
    void printInfo(){
        System.out.println("warna : "+getWarna());
    }
}

