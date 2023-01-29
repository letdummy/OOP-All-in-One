package module_10;

import java.util.Scanner;

public class lampTest implements ActivityLamp{
    public static void main(String[] args) {
        lampTest test = new lampTest();
        test.setLampStatus(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Lamp status: " + test.lampStatus);
        System.out.println("\n0. Turned off\n1. Turned on");
        System.out.println("your input:");

        if (test.setLampStatus(sc.nextInt()) == 0){
            test.matikanLampu();
        } else {
            test.hidupkanLampu();
        }
    }
    public int lampStatus;
    @Override
    public void matikanLampu() {
        if (lampStatus == 0){
            System.out.println("Lamp already turned off");
        } else if (lampStatus == 1) {
            lampStatus -= 1;
            System.out.println("Lamp turned off");
        }
    }
    @Override
    public void hidupkanLampu() {
        if (lampStatus == 1){
            System.out.println("Lamp already turned on");
        } else if (lampStatus == 0) {
            lampStatus += 1;
            System.out.println("Lamp turned on");
        }
    }
    @Override
    public void redupkanLampu() {

    }
    public int setLampStatus(int newStatus){
        return lampStatus = newStatus;
    }
}





