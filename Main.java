import Free.Air;
import Free.Floor;
import Free.Today;
import People.*;
import Things.Plant;
import Things.Propeller;
import Enumeration.*;
import Things.Rag;

public class Main {
    public static void main (String[] args){
        Today today = new Today();
        Floor hall = new Floor(50);
        Mom Mom = new Mom("Мама","27.10");
        Carlson Carlson = new Carlson( "Карлсон","23.01");
        Malysh Malysh = new Malysh("Малыш", "26.05", 3);
        Mom.LeaveHome();
        Mom.setTimeInOffice(5);
        hall.flood(100);
        System.out.println(hall.toString());
        Rag rag = new Rag("Тряпка","желтый",Materials.WOOL);
        Rag rag2 = new Rag("Тряпoчка","желтый",Materials.WOOL);
        if (rag.equals(rag2))
            Malysh.TakeRag(rag2);
        Plant Begonia = new Plant("Бегония","Синий");
        Carlson.destroyPlant(Begonia);
        Malysh.setEmotion(Emotions.AFRAID);
        Malysh.say();
        Carlson.setEmotion(Emotions.SURPRISED);
        Carlson.say();
        Carlson.LeaveHome();
        Malysh.movement();
        Carlson.sight();
        Propeller propeller = new Propeller("Пропеллер с кнопкой", "Серебро", 3, "К-26", 10);
        propeller.setSpeed(propeller.getMAXSPEED());
        if (propeller.getSpeed() > 5){
            Air.whistle();
        }
        Malysh.sight();
        Carlson.wawe();
        Carlson.LeaveHome();
        if (Carlson.equals(today))
            Carlson.remember();
        if (!Malysh.isRagInHand())
            Malysh.TakeRag(rag);
        rag.dry(Malysh.getPOWER());
        Malysh.setSpeed(rag.getSpeedDry());
        Malysh.clean(Mom.getTimeInOffice());
        hall.dry(Malysh.getCleanArea());
        Mom.movement();
        if (Begonia.isDead() && hall.isWet()) {
            Mom.setEmotion(Emotions.ANGRY);
            if (Mom.isAtHome() && Carlson.isNotAtHome())
                Carlson.lucky();
        }
        Mom.say();
    }
}

