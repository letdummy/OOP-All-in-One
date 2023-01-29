package module_09;

public class GeometryDemo {
    public static void main(String[] args) {
        Block block = new Block();
        Cube cube = new Cube();
        Ball ball = new Ball();
        Cone cone = new Cone();
        TriangularPrism triangularPrism = new TriangularPrism();

        System.out.println("Block Volume: " + block.volume());
        System.out.println("Block Surface Area: " + block.surfaceArea());
        System.out.println("===========================================\n");
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.surfaceArea());
        System.out.println("===========================================\n");
        System.out.println("Ball Volume: " + ball.volume());
        System.out.println("Ball Surface Area: " + ball.surfaceArea());
        System.out.println("===========================================\n");
        System.out.println("Cone Volume: " + cone.volume());
        System.out.println("Cone Surface Area: " + cone.surfaceArea());
        System.out.println("===========================================\n");
        System.out.println("Triangular Prism Volume: " + triangularPrism.volume());
        System.out.println("Triangular Prism Surface Area: " + triangularPrism.surfaceArea());
        System.out.println("===========================================\n");
    }
}
