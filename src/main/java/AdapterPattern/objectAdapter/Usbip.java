package AdapterPattern.objectAdapter;


//sout  System.out.println();补全
public class Usbip implements Usb{

    @Override
    public void isUsb() {
        System.out.println("usbip");
    }
}
