package module_05;
public class Book {
    String author, title;
    int pubYear, xPrint;
    double price;

    public Book(String author, String title, int pubYear, int xPrint, double price){
        this(author, title, pubYear, xPrint);
        this.price = price;
        bookInfo();
    }
    public Book(String author, String title, int pubYear, int xPrint){
        this(pubYear, xPrint);
        this.author = author;
        this.title = title;
    }
    public Book(int pubYear, int xPrint){
        this.pubYear = pubYear;
        this.xPrint = xPrint;
    }
    public void bookInfo(){
        System.out.println("======Book's Information======");
        System.out.println("Author: " + this.author);
        System.out.println("Title: " + this.title);
        System.out.println("Publish Year: " + this.pubYear);
        System.out.println("Series: " + this.xPrint);
        System.out.println("Price: " + this.price + "\n");
    }
}








