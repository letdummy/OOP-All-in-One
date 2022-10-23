package module_05;

public class Assignment {
    String subject = "Unknown";
    int moduleOrder = 5;

    public Assignment(){
        assignmentInfo();
    }

    public Assignment(String subject, int moduleOrder){
        this.subject = subject;
        this.moduleOrder = moduleOrder;

        assignmentInfo();
    }

    public void assignmentInfo(){
        System.out.println("This is an Assignment of " + this.subject + " module number " + this.moduleOrder);
    }
}



