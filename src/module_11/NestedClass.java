package module_11;

public class NestedClass {
    String name = "Agus Ardiansyah";
    String id = "L200214197";
    public void printName(){
        System.out.println(name + " : " + id);
    }
    static class StaticNestedClass {
        static String Major = "Informatics";
        NestedClass outer = new NestedClass();
        public void printInfo(){
            outer.printName();
        }
    }
    class InnerClass {
        public String getMajor(){
            return StaticNestedClass.Major;
        }
    }
}

