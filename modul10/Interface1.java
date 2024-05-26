package modul10;

interface Interface1 {
    public void tampilInfo();
    public void setInfo(String info);
}
interface Interface2 {
    public void cetakInfo();
}

class  MultiInterfaces implements Interface1,Interface2 {
    private String info;
    public void setInfo(String info){
        this.info = info;
    }
    public void tampilInfo(){
        System.out.println(this.info+" : ini info dari method tampilInfo");
    }
    public void cetakInfo(){
        System.out.println(this.info+" : ini info dari method cetaklInfo");
    }
    public static void main(String[] args) {
        MultiInterfaces t=new MultiInterfaces();
        t.setInfo("Hai");
        t.tampilInfo();
    }
}

