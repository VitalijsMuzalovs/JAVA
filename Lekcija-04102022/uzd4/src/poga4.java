class plate{
    String model;
    public plate(String model){
        this.model = model;
    }

    static class USB{
        int usb2=2;
        int usb3=1;
        int getTotalPorts(){
            if(plate.this.model.equals("MSI")){
                return 4;
            }else{
                return usb2+usb3;
            }
        }

    }
}


public class poga4 {
    public static void main(String[] args) {
        plate.USB myPlate = new plate.USB();
        System.out.println("Total:" + myPlate.getTotalPorts());

    }
}
