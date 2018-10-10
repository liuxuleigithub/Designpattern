package AdapterPattern.objectAdapter;

public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("USB口");
    }
}
