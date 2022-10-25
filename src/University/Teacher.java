package University;

public class Teacher {
    private String name, address, teacherID;
    private int age;
    private double salary;

    public Teacher(){
        this.name = "Dimas Aryo Anggoro";
        this.address = "Solo, Central Java";
        this.teacherID = "1811";
        this.age = 25;
        this.salary = 100_000_000; //underscore for readability
    }

    public void getStudentName(Student s){
        System.out.println(s.getName());
    }
    public void getStudentAddress(Student s){
        System.out.println(s.getAddress());
    }
    public void getStudentID(Student s){
        System.out.println(s.getStudentID());
    }
    public void getStudentAge(Student s){
        System.out.println(s.getAge());
    }
    public void getStudentGPA(Student s){
        System.out.println(s.getGPA());
    }

    public void setGPA(Student s, double gpa){
        s.setGPA(gpa);
    }
}
