package modul13;

public abstract class RoundShape {
    protected class Center {
        int x, y;
    }

    protected Center C = new Center();
    protected float radiusOfCircle;

    public RoundShape(int xCenter, int yCenter, float radius) {
        C.x = xCenter;
        C.y = yCenter;
        radiusOfCircle = radius;
    }

    abstract public float area();
}

