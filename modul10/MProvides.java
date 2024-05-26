package modul10;

interface MProvides {
    void Mprovides();
}

interface MRequires {
    int getValue();
}
class Mixin implements MProvides {
    private final MRequires parent;

    public Mixin(MRequires parent) {
        this.parent = parent;
    }

    public void Mprovides() {
        System.out.println("Nilai dari method MProvides : " + parent.getValue());
    }
}
class Parent {
    private int value;

    public Parent(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
class Child extends Parent implements MRequires, MProvides {
    private final MProvides mixin;

    public Child(int value) {
        super(value);
        this.mixin = new Mixin(this);
    }

    public void MProvides() {
        mixin.Mprovides();
    }

    public int getValue() {
        return super.getValue();
    }

    @Override
    public void Mprovides() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Mprovides'");
    }
}
class TestInterface {
    public static void main(String[] args) {
        Child anak = new Child(5);
        anak.MProvides();
        System.out.println("Nilai dari method getValue : " + anak.getValue());
    }
}

