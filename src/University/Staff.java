package University;

public class Staff {
    private String name, address, teacherID;
    private int age;
    private double salary;

    public Staff(){
        this.name = "Rama Rizky";
        this.address = "Solo, Central Java";
        this.teacherID = "L";
        this.age = 22;
        this.salary = 1_000_000; //underscore for readability
    }

    public void setStudentName(Student s, String name){
        s.setName(name);
    }
    public void setStudentAddress(Student s, String address){
        s.setAddress(address);
    }
    public void setStudentID(Student s, String studentID){
        s.setStudentID(studentID);
    }
    public void setStudentAge(Student s, int age){
        s.setAge(age);
    }

}
