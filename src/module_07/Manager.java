package module_07;

public class Manager extends Karyawan {
    private float workHours = 7.5F;

    public float getWorkHours() {
        return workHours;
    }

    public void setWorkHours(float workHours) { //here is the setter for workHours
        this.workHours = workHours;
    }

    public float getManagerWage() {
        return getWage() * 2;
    }
}







