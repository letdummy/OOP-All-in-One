package module_08;

public class Dog extends Pet{
    public String behavior(){
        return "likes eating meat and bones";
    }

    public String bark(){
        return "Woof! Woof! Woof!";
    }

    public void showInfo(){
        System.out.println(callName());
        System.out.println(behavior());
        System.out.println(bark());
    }
}



