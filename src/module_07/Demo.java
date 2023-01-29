package module_07;

public class Demo {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.setName("John");
        manager1.setAge(30);
        manager1.setWage(1_000_000);
        manager1.setWorkHours(8.5F);

        System.out.println("Nama: " + manager1.getName());
        System.out.println("Umur: " + manager1.getAge());
        System.out.println("Gaji karyawan: " + manager1.getWage());
        System.out.println("Jam kerja: " + manager1.getWorkHours());
        System.out.println("Gaji manager: " + manager1.getManagerWage() + "\n");

        //===================================================================================//

        Manager manager2 = new Manager();
        manager2.setName("Wick");
        manager2.setAge(35);
        manager2.setWage(2_000_000);
        manager2.setWorkHours(8.5F);

        System.out.println("Nama: " + manager2.getName());
        System.out.println("Umur: " + manager2.getAge());
        System.out.println("Gaji karyawan: " + manager2.getWage());
        System.out.println("Jam kerja: " + manager2.getWorkHours());
        System.out.println("Gaji manager: " + manager2.getManagerWage() + "\n");

        //===================================================================================//

        Manager manager3 = new Manager();
        manager3.setName("Doe");
        manager3.setAge(40);
        manager3.setWage(3_000_000);
        manager3.setWorkHours(8.5F);

        System.out.println("Nama: " + manager3.getName());
        System.out.println("Umur: " + manager3.getAge());
        System.out.println("Gaji karyawan: " + manager3.getWage());
        System.out.println("Jam kerja: " + manager3.getWorkHours());
        System.out.println("Gaji manager: " + manager3.getManagerWage() + "\n");

        //===================================================================================//

        Manager manager4 = new Manager();
        manager4.setName("Smith");
        manager4.setAge(45);
        manager4.setWage(4_000_000);
        manager4.setWorkHours(8.5F);

        System.out.println("Nama: " + manager4.getName());
        System.out.println("Umur: " + manager4.getAge());
        System.out.println("Gaji karyawan: " + manager4.getWage());
        System.out.println("Jam kerja: " + manager4.getWorkHours());
        System.out.println("Gaji manager: " + manager4.getManagerWage() + "\n");

        //===================================================================================//

        Manager manager5 = new Manager();
        manager5.setName("Morgan");
        manager5.setAge(50);
        manager5.setWage(5_000_000);
        manager5.setWorkHours(8.5F);

        System.out.println("Nama: " + manager5.getName());
        System.out.println("Umur: " + manager5.getAge());
        System.out.println("Gaji karyawan: " + manager5.getWage());
        System.out.println("Jam kerja: " + manager5.getWorkHours());
        System.out.println("Gaji manager: " + manager5.getManagerWage() + "\n");

        //===================================================================================//
    }
}
