class Plate{

    static  class USB{
        int usb2 =2;
        int usb3=1;

        int geTotalPorts(){
            return usb2+usb3;
        }
    }

}

public class poga3 {
    public static void main(String[] args) {
        Plate.USB plate1 = new Plate.USB();
        System.out.println("Total:" + plate1.geTotalPorts());
    }
}
