package People;

import Interfaces.Ability;
import Interfaces.Speed;
import Enumeration.*;
import Things.Rag;

public class Malysh extends Human implements Speed, Ability {
    private boolean RagInHand = false;
    private double speed = 0;
    private double cleanArea = 0;
    private final double POWER;

    public Malysh(String name, String birthday, double power) {
        super(name, birthday);
        this.POWER = power;
    }

    public double getPOWER() {
        return POWER;
    }

    @Override
    public void movement() {
        System.out.println( getName() + " побежал к окну");
    }
    @Override
    public void say() {
        System.out.println("Что скажет мама? - Сказал" + getEmotion().toString() + " " + getName());
    }

    @Override
    public void wawe() {
        if (RagInHand)
            System.out.println(" и" + getEmotion().toString() + " замахал ему тряпкой");
        else
            System.out.println(" и замахал ему");
    }

    @Override
    public void sight() {
        setEmotion(Emotions.HAPPINESS);
        System.out.print( getName() + " увидел Карлсона");
        wawe();
    }

    @Override
    public void setSpeed(double speedDry) {
        speed = Math.random() * speedDry;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
    public void clean(int time){
        System.out.println("Малыш стал собирать тряпкой воду с пола прихожей ");

        cleanArea = getSpeed() * time;
    }

    public double getCleanArea() {
        return cleanArea;
    }
    public void TakeRag(Rag rag){
        System.out.println(getName() + " взял в руки " + rag.getItemName());
        RagInHand = true;
    }

    public boolean isRagInHand() {
        return RagInHand;
    }
}
