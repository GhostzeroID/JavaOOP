package modul13;

class Awal {
    int x = 8;

    void methodAwal() {
        System.out.println("Nilai x=" + x);
    }
}
class TestAnonymous {
    public static void main(String[] args) {
        Awal noName = new Awal() {
            void methodAwal() {
                x += 3;
                System.out.println("x=" + x);
            }
        };
        noName.methodAwal();
    }
}

