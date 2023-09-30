public class Main {
    public static void main(String[] args) {
        SmartKitchen Kitchen = new SmartKitchen();
        Kitchen.setKitchenState(true,false,true);
        Kitchen.doKitchenWork();
    }
}