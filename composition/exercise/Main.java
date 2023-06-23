package inheritance.composition.exercise;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getBrewMaster().brewCoffee();
        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }
}