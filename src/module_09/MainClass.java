package module_09;
public class MainClass {
    public static void main(String[] args) {

        Rectangular persegiPanjang = new Rectangular();
        System.out.println("Rectangular circumference: " + persegiPanjang.getCircumference());
        System.out.println("Rectangular area: " + persegiPanjang.getArea());
        System.out.println("================================\n");

        Circle lingkaran = new Circle();
        System.out.println("Circle circumference: " + lingkaran.getCircumference());
        System.out.println("Circle area: " + lingkaran.getArea());
        System.out.println("================================\n");

        Parallelogram belahKetupat = new Parallelogram();
        System.out.println("Parallelogram circumference: " + belahKetupat.getCircumference());
        System.out.println("Parallelogram area: " + belahKetupat.getArea());
        System.out.println("================================\n");

        Triangle segitiga = new Triangle();
        System.out.println("Triangle circumference: " + segitiga.getCircumference());
        System.out.println("Triangle area: " + segitiga.getArea());
        System.out.println("================================\n");
        System.out.println(lingkaran.radius);
        System.out.println(lingkaran.phi);
        System.out.println(lingkaran.radius * lingkaran.radius);
        System.out.println(lingkaran.radius * lingkaran.radius * lingkaran.phi);

    }
}
