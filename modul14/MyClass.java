package modul14;

public class MyClass {
    public MyClass() {
        new Thread() {
            public void run() {
                System.out.println("Threat dijalanankan ");
            }
        }.start();
    }

    public static void main(String[] args) {
        new MyClass();
    }

}
