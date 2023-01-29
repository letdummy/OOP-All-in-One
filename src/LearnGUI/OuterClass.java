package LearnGUI;

public class OuterClass {
    public class InnerClass { //inner class or non-static nested class
        public static void innerMethod() {
            System.out.println("This is an inner method");
        }
    }

    public static class StaticNestedClass { //static nested class
        public static void staticNestedMethod() {
            System.out.println("This is a static inner method");
        }

        public void test(){
            System.out.println("Test");
        }

        static double taxRate = 10_000;
    }
}
