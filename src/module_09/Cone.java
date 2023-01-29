package module_09;

public class Cone extends Abstract{
    int height = 5;
    int radius = 5;
    @Override
    public int volume() {
        return (int) (Math.PI * (radius * radius) * height) / 3;
    }

    @Override
    public int surfaceArea() {
        return (int) (Math.PI * radius * (radius + Math.sqrt((height * height) + (radius * radius))));
    }
}
