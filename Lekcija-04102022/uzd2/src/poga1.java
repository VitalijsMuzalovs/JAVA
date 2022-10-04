class Car {
    String carName;
    String carType;

    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    private String getCarName() {
        return this.carName;
    }

    private String getCarType(){
        return this.carType;
    }

    class Engine{
        String engineType;

        void setEngineType(){
            if(Car.this.carType.equals("4wd")){
                if(Car.this.getCarName().equals("Crysler")){
                    this.engineType="Mazāks";
                }else{
                    this.engineType="Lielāks";
                }
            }else{
                this.engineType="LIELĀKS";
            }
        }

        String getEngineType(){
            return this.engineType;
        }

    }

}

public class poga1 {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda","8wd");
        Car.Engine engine1 = car1.new Engine();
        engine1.setEngineType();
        System.out.println("Dzinēja tips priekš 8wd =" + engine1.getEngineType());

        Car car2 = new Car("Crysler","4wd");
        Car.Engine engine2 = car2.new Engine();
        engine2.setEngineType();
        System.out.println("Dzinēja tips priekš 4wd =" + engine2.getEngineType());
    }
}
