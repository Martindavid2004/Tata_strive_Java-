package martin;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Created by OOOO");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton o = Singleton.getInstance(); 
        Singleton O = Singleton.getInstance(); 
        o.showMessage();

        System.out.println(o == O);
    }
}