package Abstract;

public class Student extends Member{
    private String studentID;
    private int age;
    private double gpa;
    private static final int MAX_GPA = 4;

    public Student(){
        this.name = "Agus Ardiansyah";
        this.address = "Solo, Central Java";
        this.studentID = "L200214197";
        this.age = 19;
        this.gpa = 3.9;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public String getStudentID(){
        return this.studentID;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setGPA(double gpa){
        if(gpa > MAX_GPA){
            System.out.println("GPA cannot be more than " + MAX_GPA);
        }else{
            this.gpa = gpa;
        }
    }
    public double getGPA(){
        return this.gpa;
    }

    @Override
    void attendance() {
        System.out.println("Student is attending at UMS via fingerprint");
    }
}
