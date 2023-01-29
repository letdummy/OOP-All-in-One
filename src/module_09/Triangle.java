package module_09;

public class Triangle extends AbstractClass{
    int side = 8; //alas
    int height = 6; //tinggi
    int hypotenuse = 10; //sisi miring
    @Override
    public int circumference() {
        return side + height + hypotenuse;
    }
    @Override
    public int area() {
        return (side * height)/2;
    }
}
