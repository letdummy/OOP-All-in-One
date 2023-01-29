package module_08;

public class Cat extends Pet{
    public String behavior(){
        return "likes eating fish";
    }

    public String meow(){
        return "Meow! Meow! Meow!";
    }

    public void showInfo(){
        System.out.println(callName());
        System.out.println(behavior());
        System.out.println(meow());
    }
}


