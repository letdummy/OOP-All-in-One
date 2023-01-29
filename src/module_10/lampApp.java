package module_10;
import java.util.Scanner;
public class lampApp {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Scanner sc = new Scanner(System.in);
        lamp.statusLampu = lamp.setSaklar(0);
        lamp.status();
        System.out.println("Input your choice: ");
        int input = sc.nextInt();

        boolean loop = true;
        while (loop){
            if (input == 0){
                lamp.matikanLampu();
                lamp.status();
                lamp.setSaklar(input);
                System.out.println("Input your choice: ");
                input = sc.nextInt();
            } else if (input == 1) {
                lamp.redupkanLampu();
                lamp.status();
                lamp.setSaklar(input);
                System.out.println("Input your choice: ");
                input = sc.nextInt();
            } else if (input == 2) {
                lamp.hidupkanLampu();
                lamp.status();
                lamp.setSaklar(input);
                System.out.println("Input your choice: ");
                input = sc.nextInt();
            } else if (input == 9) {
                System.out.println("Terima kasih, selamat tingggal");
                loop = false;
            } else {
                System.out.println("Error");
                lamp.status();
                lamp.setSaklar(input);
                System.out.println("Input your choice: ");
                input = sc.nextInt();
            }
        }
    }
}
