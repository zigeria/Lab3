package Things;

public class Plant extends Item {
    private boolean dead = false;

    public Plant(String itemName, String color) {
        super(itemName, color);
    }

    public void perish(){
        dead = true;
    }

    public boolean isDead() {
        return dead;
    }

}
