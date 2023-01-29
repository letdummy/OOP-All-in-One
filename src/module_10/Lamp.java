package module_10;

public class Lamp implements ActivityLamp {
    public int statusLampu;

    @Override
    public void matikanLampu() {
        if (statusLampu == 0) {
            flush();
            System.out.println("[[   Lampu sudah dalam kondisi mati   ]]");
        } else{
            statusLampu = 0;
            flush();
            System.out.println("[[   UPDATE: Lampu dimatikan   ]]");
        }
    }

    @Override
    public void redupkanLampu() {
        if (statusLampu == 1) {
            flush();
            System.out.println("[[   Lampu sudah dalam kondisi redup   ]]");
        } else {
            statusLampu = 1;
            flush();
            System.out.println("[[   UPDATE: Lampu diredupkan   ]]");
        }
    }

    @Override
    public void hidupkanLampu() {
        if (statusLampu == 2) {
            flush();
            System.out.println("[[   Lampu sudah dalam kondisi hidup   ]]");
        } else {
            statusLampu = 2;
            flush();
            System.out.println("[[   UPDATE: Lampu dihidupkan   ]]");
        }
    }


    public int setSaklar(int saklar) {
        return statusLampu = saklar;
    }

    public void status(){
        System.out.println("Status Lampu = " + this.statusLampu);

        System.out.println("\nKetikan: \n");
        System.out.println("0. Matikan Lampu");
        System.out.println("1. Redupkan Lampu");
        System.out.println("2. Hidupkan Lampu");
        System.out.println("9. Keluar program");
    }

    public void flush(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
