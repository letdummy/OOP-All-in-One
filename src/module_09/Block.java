package module_09;

public class Block extends Abstract{
    int height = 5;
    int length = 5;
    int width = 5;
    @Override
    public int volume() {
        return length * width * height;
    }

    @Override
    public int surfaceArea() {
        return 2 * ((length * width) + (width * height) + (length * height));
    }
}
