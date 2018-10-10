package AdapterPattern.classAdapter;

public class Clienter {
    public static void main(String[] args) {
        Ps2 p = new Adapter();
        p.isPs2();
    }
}
