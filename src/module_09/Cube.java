package module_09;

public class Cube extends Abstract{
    int side = 5;
    @Override
    public int volume() {
        return side * side * side;
    }

    @Override
    public int surfaceArea() {
        return 6 * (side * side);
    }
}
