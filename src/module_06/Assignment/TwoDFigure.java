package module_06.Assignment;

public class TwoDFigure {
    double area;
    double perimeter;

    void countArea(double width, double height){
        this.area = width * height;
    }

    double countPerimeter(double width, double height){
        this.perimeter = 2 * (width + height);
        return perimeter;
    }
}




