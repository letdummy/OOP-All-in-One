package module_08;

public class OverridingDemo {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();

        parent.printOut();
        child.printOut();
    }
}



