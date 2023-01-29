package module_09;

public class Parallelogram extends AbstractClass{
    int side1 = 24;
    int side2 = 15;
    int height = 10;
    @Override
    public int circumference() {
        return 2 * (side1 + side2);
    }
    @Override
    public int area() {
        return side1 * height;
    }
}
