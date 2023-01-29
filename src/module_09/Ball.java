package module_09;

public class Ball extends Abstract{
    int radius = 5;
    @Override
    public int volume() {
        return (int) ((4 * Math.PI * (radius * radius * radius)) / 3);
    }

    @Override
    public int surfaceArea() {
        return (int) (4 * Math.PI * (radius * radius));
    }
}
