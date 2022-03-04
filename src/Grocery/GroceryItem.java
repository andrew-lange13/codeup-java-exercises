package Grocery;

public class GroceryItem {

    private String thing;
    private int thingQuantity;

    public GroceryItem(String thing, int thingQuantity) {
        this.thing = thing;
        this.thingQuantity = thingQuantity;
    }

    public String getThing() {
        return thing;
    }

    public int getThingQuantity() {
        return thingQuantity;
    }
}
