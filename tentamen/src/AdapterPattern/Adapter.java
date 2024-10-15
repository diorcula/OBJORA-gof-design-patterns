package AdapterPattern;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
