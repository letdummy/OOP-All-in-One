package module_09;

public class Circle extends AbstractClass{
    int radius = 7;
    int phi = 22/7;
    @Override
    public int circumference() {
        return 2 * phi * radius;
    }
    @Override
    public int area() {
        return (phi * radius) * radius;
    }
}
