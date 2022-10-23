package module_06.Assignment;

public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangular rectangular = new Rectangular();
        Triangle triangle = new Triangle();
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();

        //RECTANGLE
        rectangle.side = 5;
        rectangle.countArea(rectangle.side, rectangle.side); //side * side
        rectangle.countPerimeter(rectangle.side, rectangle.side); //2 * (side + side)

        //RECTANGULAR
        rectangular.width = 5;
        rectangular.height = 10;
        rectangular.countArea(rectangular.width, rectangular.height); //width * height
        rectangular.countPerimeter(rectangular.width, rectangular.height); //2 * (width + height)

        //TRIANGLE
        triangle.base = 5;
                //unable to count area and perimeter without height

        //ISOSCELES TRIANGLE
        isoscelesTriangle.base = 5;
        isoscelesTriangle.hypotenuse = 10;
        isoscelesTriangle.countArea(isoscelesTriangle.base/2, Math.sqrt(Math.pow(isoscelesTriangle.hypotenuse, 2) -
                                                            Math.pow(isoscelesTriangle.base, 2)));
                                                            //base/2 * height (height = sqrt(hypotenuse^2 - base^2))
                                                            //pythagoras theorem
        isoscelesTriangle.countPerimeter(isoscelesTriangle.base/2, isoscelesTriangle.hypotenuse);
                                        //(base/2 + hypotenuse) * 2

        //EQUILATERAL TRIANGLE
        equilateralTriangle.side = 5;
        equilateralTriangle.countArea(equilateralTriangle.side/2, Math.sqrt(Math.pow(equilateralTriangle.side, 2) -
                                                                Math.pow(equilateralTriangle.base, 2)));
                                                                //base/2 * height (height = sqrt(side^2 - base^2)));
                                                                //pythagoras theorem
        equilateralTriangle.countPerimeter(equilateralTriangle.base/2, equilateralTriangle.side);
                                          //(base/2 + side) * 2


        tableHeader("FIGURE", "WIDTH", "HEIGHT", "AREA", "PERIMETER");
        tableContent("Rectangle", Double.toString(rectangle.side), Double.toString(rectangle.side), Double.toString(rectangle.area), Double.toString(rectangle.perimeter));
        tableContent("Rectangular", Double.toString(rectangular.width), Double.toString(rectangular.height), Double.toString(rectangular.area), Double.toString(rectangular.perimeter));
        tableContent("Triangle", Double.toString(triangle.base), "NULL", "NULL", "NULL");
        tableContent("Isosceles", Double.toString(isoscelesTriangle.base), Double.toString(isoscelesTriangle.hypotenuse), Double.toString(Math.round(isoscelesTriangle.area)), Double.toString(isoscelesTriangle.perimeter));
        tableContent("Equilateral", Double.toString(equilateralTriangle.side), Double.toString(equilateralTriangle.side), Double.toString(equilateralTriangle.area), Double.toString(equilateralTriangle.perimeter));

    }

    private static void tableHeader(String... headers) {
        String PIPE = "|";

        tableLine(headers.length);
        for (String item : headers) {
            System.out.format("%3s%15s", PIPE, item);
        }
        System.out.format("%3s", PIPE);
        System.out.println();
        tableLine(headers.length);
    }

    private static void tableContent(String... contents) {
        String PIPE = "|";
        for (String item : contents) {
            System.out.format("%3s%15s", PIPE, item);
        }
        System.out.format("%3s", PIPE);
        System.out.println();
        tableLine(contents.length);
    }

    private static void tableLine(int totalHeader) {
        String DASH = "-----------------";
        String POINT = "+";
        int count = 0;

        System.out.format("%2s", "");
        while (count < totalHeader) {
            System.out.format("%1s%1s", POINT, DASH);
            count++;
        }
        System.out.format("%1s", POINT);
        System.out.println();
    }
}





