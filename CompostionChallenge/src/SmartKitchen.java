public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private  DishWasher dishwasher;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishwasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishwasher() {
        return dishwasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasToDo(true);
        dishwasher.setHasToDo(true);
        iceBox.setHasToDo(true);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishwasher.doDishes();
    }
}

class CoffeeMaker{
    private boolean hasToDo;

    public void setHasToDo(boolean hasToDo) {
        this.hasToDo = hasToDo;
    }

    public void brewCoffee(){
        if(hasToDo){
            System.out.println("Brewing Coffee ... ");
            hasToDo = false;
        }
    }
}

class DishWasher{
    private boolean hasToDo;

    public void setHasToDo(boolean hasToDo) {
        this.hasToDo = hasToDo;
    }

    public void doDishes(){
        if(hasToDo){
            System.out.println("Washing the dishes ... ");
            hasToDo = false;
        }
    }
}

class Refrigerator{
    private boolean hasToDo;

    public void setHasToDo(boolean hasToDo) {
        this.hasToDo = hasToDo;
    }

    public void orderFood(){
        if(hasToDo){
            System.out.println("Ordering food ... ");
            hasToDo = false;
        }
    }
}