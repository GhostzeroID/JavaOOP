package modul123;
public class Calculation2
{
    void sum(int a, int b)
    {
        System.out.println(a+b);
    }
    void sum(double c, double d)
    {
        System.out.println(c+d);
    }
    void sum(double c, double d, int a)
    {
        System.out.println(c+d+a);
    }
    public static void main(String[] args) {
        Calculation2 Obj = new Calculation2();
        Obj.sum(10.5,10.5);
        Obj.sum(20, 20);
        Obj.sum(20.5,20.5,20);
    }
}


