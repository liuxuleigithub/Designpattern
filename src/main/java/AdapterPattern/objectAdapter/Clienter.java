package AdapterPattern.objectAdapter;

public class Clienter {
    public static void main(String[] args) {
        Ps2 p = new Adapter(new Usber());
        p.isPs2();
        Ps2 p1 = new Adapter(new Usbip());
        p1.isPs2();
    }
}
