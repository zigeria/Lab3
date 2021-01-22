package People;

import Interfaces.Ability;
import Interfaces.LeaveHome;
import Things.Plant;

public class Carlson extends Human implements LeaveHome, Ability {
    private boolean attentiveness = false;
    private boolean notAtHome = false;
    public Carlson(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void movement() {
        if (attentiveness) {
            System.out.println(getName() + " спикировал вниз и промчался мимо окна");

        }
        else
            System.out.println( getName()+ " летел");
    }

    @Override
    public void say() {
        System.out.println("Неужели твоя мама никогда не швыряет из окон цветочные горшки? - " + getEmotion().toString() + " сказал " + getName());
    }

    @Override
    public void LeaveHome() {
        notAtHome = true;
        System.out.println( getName() + " улетел");
    }

    @Override
    public void wawe() {
        System.out.println( getName() + " махнул в ответ своей пухленькой ручкой");
    }

    @Override
    public void sight() {
        attentiveness = true;
        System.out.print( getName() + " увидел Малыша,");
        movement();
        attentiveness = false;

    }

    public void destroyPlant(Plant plant){
        System.out.println(getName() + " выкинул цветок");
        plant.perish();
    }

    public void remember(){
        System.out.println( getName() + " вспоминает, что у него день рождения");
    }

    public void lucky(){
        System.out.println("Карлсону повезло, что его не было, когда мама вернулась из бюро путешествий");
    }

    public boolean isNotAtHome() {
        return notAtHome;
    }
}
