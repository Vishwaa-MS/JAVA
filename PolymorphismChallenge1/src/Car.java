public class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name ) {
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine(){
        return (getClass().getSimpleName()+" -> " + "startEngine()");
    }

    public String accelerate(){
        return (getClass().getSimpleName()+" -> " + "accelerate()");
    }

    public String brake(){
        return (getClass().getSimpleName()+" -> " + "brake()");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders,name);
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders,name);
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders,name);
    }
}