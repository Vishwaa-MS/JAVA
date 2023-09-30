public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborghini Urus");
//        runRace(car);

        Car car1 = new gasPoweredCar("Lamborghini Urus", 50.0, 8);
        runRace(car1);
    }
    public static  void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}