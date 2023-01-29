package Abstract;

public abstract class Member {
    String name, address;

    void parking() {
        System.out.println("Member can park at UMS parking lot");
    }

    abstract void attendance();
}
