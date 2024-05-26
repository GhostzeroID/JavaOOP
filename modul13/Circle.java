package modul13;

public class Circle extends RoundShape {
    public Circle(int xCenter, int yCenter, float radius){
        super(xCenter, yCenter, radius);
       }
       public float area(){
        float areaOfCircle = (float)(Math.PI*Math.pow(radiusOfCircle,2.0));
        return areaOfCircle;
       }
       
}


