public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){

        System.out.println("Car -> Starting Engine");
    }
    protected void runEngine(){
        System.out.println("Car -> Running Engine of type ");
    }
    public void drive(){
        System.out.println("Car -> Driving, type is " + getClass().getSimpleName());
        runEngine();

    }
}

class gasPoweredCar extends Car{
    private double avgKm;
    private int cylinder = 6;


    public gasPoweredCar(String description) {
        super(description);
    }
    public gasPoweredCar(String description, double avgKm, int cylinder) {
        super(description);
        this.avgKm = avgKm;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinder);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Usage exceeds the average %.2f %n", avgKm);
    }
}

class electricCar extends Car{
    private double avgKm;
    private int batterySize = 6;


    public electricCar(String description) {
        super(description);
    }
    public electricCar(String description, double avgKm, int batterySize) {
        super(description);
        this.avgKm = avgKm;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> All %d battery are fired up, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Usage exceeds the average %.2f %n", avgKm);
    }
}
class hybridCar extends Car{
    private double avgKm;
    private int cylinder = 6;


    public hybridCar(String description) {
        super(description);
    }
    public hybridCar(String description, double avgKm, int cylinder) {
        super(description);
        this.avgKm = avgKm;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinder);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Usage exceeds the average %.2f %n", avgKm);
    }
}

