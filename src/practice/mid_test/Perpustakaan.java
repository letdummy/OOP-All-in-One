package practice.mid_test;

public class Perpustakaan {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.title = "OO Programming Using Java";
        buku1.author = "S Kendal";
        buku1.pubYear = 2018;
        buku1.stock = 2;

        Buku buku2 = new Buku();
        buku2.title = "Dasar Teknik Informatika";
        buku2.author = "Novel Pratama";
        buku2.pubYear = 2018;
        buku2.stock = 3;

        Buku buku3 = new Buku();
        buku3.title = "Komputer Cerdas";
        buku3.author = "Nurul Nafiyah";
        buku3.pubYear = 2020;
        buku3.stock = 3;

        Buku buku4 = new Buku();
        buku4.title = "Pengantar Teknologi Informasi";
        buku4.author = "Muslim Ridho";
        buku4.pubYear = 2017;
        buku4.stock = 5;

        System.out.println(buku4.title.length());
        tableHeader("Test", "Test", "Test", "Test");
        tableContent(buku1.title, buku1.author,
                Integer.toString(buku1.pubYear),
                Integer.toString(buku1.stock));
        tableContent(buku2.title, buku2.author,
                Integer.toString(buku2.pubYear),
                Integer.toString(buku2.stock));
        tableContent(buku3.title, buku3.author,
                Integer.toString(buku3.pubYear),
                Integer.toString(buku3.stock));


    }


    public static void tableHeader(String... header) {
        tableLine(header.length);
        for(String item : header) {
            System.out.format("%3s%25s", "|", item);
        }
        System.out.format("%3s%1s", "|", "\n");
        tableLine(header.length);
    }

    public static void tableLine(int length) {
        System.out.format("%2s", "");
        while(length-- > 0) {
            System.out.format("%1s%25s", "+", "---------------------------");
        }
        System.out.format("%1s%1s", "+", "\n");
    }

    public static void tableContent(String... content) {
        for(String item : content) {
            System.out.format("%3s%25s", "|", item);
        }
        System.out.format("%3s%1s", "|", "\n");
        tableLine(content.length);
    }

}



