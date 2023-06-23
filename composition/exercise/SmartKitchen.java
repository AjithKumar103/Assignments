package inheritance.composition.exercise;

public class SmartKitchen {
    private Refrigerator iceBox;
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;

    public SmartKitchen(){
        iceBox = new Refrigerator();
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public void setKitchenState(boolean coffeeFlag,boolean orderFlag,boolean dishFlag){
        iceBox.setHasWorkToDo(orderFlag);
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishFlag);
    }
    public void doKitchenWork(){
        dishWasher.doDishes();
        iceBox.orderFood();
        brewMaster.brewCoffee();
    }
}

class Refrigerator{
    boolean hasWorkToDo;

   public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}
class DishWasher{
    boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}
class CoffeeMaker{
    boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}