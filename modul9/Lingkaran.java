package modul9;

class Lingkaran extends bentuk{
    public Lingkaran(){
        System.out.println("Kelas Lingkaran turunan kelas abstract bentuk");
    }
    public String getBentuk(){
        return "Bentuk Lingkaran";
    }
    public static void main(String[] args){
    }
    @Override
    public int HitungLuas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'HitungLuas'");
    }
}

