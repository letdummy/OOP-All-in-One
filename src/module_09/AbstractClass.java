package module_09;

public abstract class AbstractClass {
    public abstract int circumference();
    public abstract int area();

    public int getArea(){
        return area();
    }

    public int getCircumference(){
        return circumference();
    }
}
