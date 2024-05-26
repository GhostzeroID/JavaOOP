package modul12;

public class demoEksepsi {
    public static void methodLain() {
        try{
            throw new ArrayIndexOutOfBoundsException(1);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Penggunaan eksepsi method method lain()");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            methodLain();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Penanganan eksepsi dalam method lain()");
        }
    }
}

