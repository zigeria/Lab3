package Things;

import Interfaces.Drying;
import Enumeration.Materials;

public class Rag extends Item implements Drying {
    private final Materials MATERIAL;
    private int absorbency;
    private double speedDry = 0;
    public Rag(String itemName, String color, Materials material) {
        super(itemName, color);
        this.MATERIAL = material;
        setAbsorbency(material);
        }

    public Materials getMATERIAL() {
        return MATERIAL;
    }

    public void setAbsorbency(Materials material) {
        switch (material){
            case SILK -> this.absorbency = 1;
            case LINEN -> this.absorbency = 2;
            case COTTON -> this.absorbency = 4;
            case VISCOSE -> this.absorbency = 6;
            case MICROFIBER -> this.absorbency = 8;
            case WOOL -> this.absorbency = 10;
        }
    }

    public int getAbsorbency() {
        return absorbency;
    }

    @Override
    public void dry(double power) {
        speedDry = getAbsorbency() * 0.5 * power;
    }

    public double getSpeedDry() {
        return speedDry;
    }

    @Override
    public int hashCode() {
        return getColor().hashCode() + getMATERIAL().hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Rag)) return false;
        Rag p = (Rag) obj;
        return this.getColor().equals(p.getColor()) && this.getMATERIAL().equals(p.getMATERIAL());
    }

    @Override
    public String toString() {
        return this.getItemName() + " " + this.getColor() + " " + this.getMATERIAL();
    }
}
