package AdapterPattern;

public class Client {
    public static void main(String[] args) {
        // Create an object of the class that implements the Target interface
        Target target = new Adapter();
        target.request();
    }
}