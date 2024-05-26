package modul13;

public class Luar {
    private int angkaLuar;
    public Luar(int angkaLuar){
        this.angkaLuar=angkaLuar;
    }
    int getAngkaLuar(){
        return angkaLuar;
    }
    //inner class
    class Dalam{
        private int angkDalam;
    public Dalam(){
        angkDalam = 9;
    }
    public void cetakDalam(){
        System.out.println("Ini angka Luar : "+angkaLuar);
        System.out.println("Ini angka dalam : "+angkDalam);
    }
    }//batas inner
    public void cetakLuar(){
        Dalam dl = new Dalam();
        dl.cetakDalam();
    }
    public static void main(String[] args) {
        Luar lu = new Luar(5);
        lu.cetakLuar();
    }
}

