package module_09;

public class TriangularPrism extends Abstract{
    int height = 5;
    int base = 5;
    int side = 5;
    @Override
    public int volume() {
        return (int) ((base * side) / 2) * height;
    }

    @Override
    public int surfaceArea() {
        return (int) ((int) (base * side) + (base * Math.sqrt((side * side) + (height * height)))
                            + (side * Math.sqrt((base * base) + (height * height))));
    }
}
