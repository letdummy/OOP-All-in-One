package module_10;

public interface ActivityLamp {
    public static final int LAMPU_MATI= 0;
    public static final int LAMPU_HIDUP= 1;
    public static final int LAMPU_REDUP= 2;
    public abstract void matikanLampu();
    public abstract void hidupkanLampu();
    public abstract void redupkanLampu();
}
