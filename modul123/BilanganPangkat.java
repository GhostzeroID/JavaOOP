package modul123;
public class BilanganPangkat 
{
    int a;
    int n;
    int hasil = 0 ;
    public void setData(int a, int n)
    {
        this.a = a;
        this.n = n;
    }    
    public int getData()
    {
       hasil = (int)Math.pow(a, n);
       return hasil;
    }
    public static void main(String[] args) {
        BilanganPangkat bilangan = new BilanganPangkat();
        bilangan.setData(4, 3);
        System.out.println(bilangan.getData());
        
    }
}

