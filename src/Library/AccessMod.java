package Library;

public class AccessMod {
    private int satu = 1;   // only accessible in the same class (own class)
    int dua = 2;            // only accessible in the same package
    protected int tiga = 3; // only accessible in the same class and subclass (either same package or different package)
    public int empat = 4;   // accessible in everywhere
}
