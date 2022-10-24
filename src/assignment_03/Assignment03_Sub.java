package assignment_03;

public class Assignment03_Sub extends Assignment03 {
    public Assignment03_Sub() {
        System.out.println("Author: NULL");
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}

/*
as we can see, the subclass can access
the default, protected, and public access modifier
but can't access the private access modifier
that's why it is error
*/







