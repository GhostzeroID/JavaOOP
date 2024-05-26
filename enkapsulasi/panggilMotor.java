package enkapsulasi;

public class panggilMotor {
    public static void main(String[] args) {
        motor motor1 = new motor();
        motor1.setId("A01");
        motor1.setWarna("Merah");
        motor1.setMerk("Honda");
        motor1.setSeri(260985);
        motor1.setHarga(23000000);
        motor1.info();
    }
}

