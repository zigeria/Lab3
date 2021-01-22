package Things;

public abstract class Item {
    private final String ITEMNAME;
    private final String COLOR;

    public Item(String itemName, String color) {
        this.ITEMNAME = itemName;
        this.COLOR = color;
    }

    public String getItemName() {
        return ITEMNAME;
    }

    public String getColor() {
        return COLOR;
    }
}
