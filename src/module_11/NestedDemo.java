package module_11;

public class NestedDemo {
    public static void main(String[] args) {
        NestedClass.StaticNestedClass staticNestedClass = new NestedClass.StaticNestedClass();
        staticNestedClass.printInfo();

        NestedClass.InnerClass innerClass = new NestedClass().new InnerClass();
        System.out.println(innerClass.getMajor());
    }
}
