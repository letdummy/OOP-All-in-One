package assignment_02;

public class Assignment02_Sub extends Assignment02 {
    public Assignment02_Sub() {
        showInfo();
    }
    public void showInfo(){
        super.author = "Fajar Suryawan";
        super.showInfo();
    }
}
/*
Subclass use the property and method from superclass.
And then override the method showInfo().
and change the value of author and print it.
the method showInfo() is called in the constructor.
*/






