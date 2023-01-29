package FInalExam;

public class Staff {
    private String name, numberID;
    // 1B =================================================
    public Staff() {
        System.out.println("New staff created");
    }
    public Staff(String name, String numberID) {
        this();
        this.name = name;
        this.numberID = numberID;
    }
    // ====================================================
    public String getName() {
        return name;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public String showOutput(){
        return getName() + " " + getNumberID();
    }
}
