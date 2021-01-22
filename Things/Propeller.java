package Things;

import Interfaces.Speed;
import java.lang.Math;

public class Propeller extends Item implements Speed {
    private final int BLADES;
    private final String MODEL;
    private final int MAXSPEED;
    private double speed;

    public Propeller(String itemName, String color,int blades, String model, int maxSpeed) {
        super(itemName, color);
        this.BLADES = blades;
        this.MODEL = model;
        this.MAXSPEED = maxSpeed;
    }

    public int getMAXSPEED() {
        return MAXSPEED;
    }

    @Override
    public void setSpeed(double maxspeed) {
        this.speed = maxspeed * Math.random();
    }

    @Override
    public double getSpeed() {
        return speed;
    }

}
