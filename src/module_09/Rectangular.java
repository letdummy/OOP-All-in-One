package module_09;

public class Rectangular extends AbstractClass{
    int side1 = 5;
    int side2 = 10;
    @Override
    public int circumference() {
        return 2*(side1 + side2);
    }

    @Override
    public int area() {
        return side1 * side2;
    }
}
