package module_06;


public class VehicleDemo {
    public static void main(String[] args) {
        Car mobil = new Car();
        AirPlane pesawat = new AirPlane();

        tableHeader("VEHICLE",
                    "FUEL", "AUTO PILOT",
                    "MAX CAPACITY", "WHEEL COUNT");

        tableContent("Car",
                    mobil.fuel, mobil.isAutoPilot,
                    Integer.toString(mobil.maxCapacity),
                    Integer.toString(mobil.wheelCount));

        tableContent("AirPlane",
                    pesawat.fuel, pesawat.isAutoPilot,
                    Integer.toString(pesawat.maxCapacity),
                    Integer.toString(pesawat.wheelCount));
    }

    private static void tableHeader(String... headers) {
        String PIPE = "|";

        tableLine(headers.length);
        for (String item : headers) {
            System.out.format("%3s%15s", PIPE, item);
        }
        System.out.format("%3s", PIPE);
        System.out.println();
        tableLine(headers.length);
    }

    private static void tableContent(String... contents) {
        String PIPE = "|";
        for (String item : contents) {
            System.out.format("%3s%15s", PIPE, item);
        }
        System.out.format("%3s", PIPE);
        System.out.println();
        tableLine(contents.length);
    }

    private static void tableLine(int totalHeader) {
        String DASH = "-----------------";
        String POINT = "+";
        int count = 0;

        System.out.format("%2s", "");
        while (count < totalHeader) {
            System.out.format("%1s%1s", POINT, DASH);
            count++;
        }
        System.out.format("%1s", POINT);
        System.out.println();
    }
}
