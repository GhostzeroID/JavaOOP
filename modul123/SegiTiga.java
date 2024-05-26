package modul123;
public class SegiTiga
{
    int a,t;
    double jum = 0;

    public void setData(int a, int t)
    {
        this.a = a;
        this.t = t;
    }
    public double getData(){ 
        jum = a * t ;
        return 1 * jum / 2 ;
    }
    public void Tampilkan()
    {
        System.out.println("Luas Segi Tiga : "+getData());
    }
    public static void main(String[] args) 
    {
        SegiTiga obj=new SegiTiga();
        obj.setData(27, 64);
        obj.Tampilkan();    
    }
}





