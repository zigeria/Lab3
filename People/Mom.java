package People;

import Interfaces.LeaveHome;
import Enumeration.Emotions;

public class Mom extends Human implements LeaveHome {
    private boolean atHome = true;
    private int TimeInOffice;

    public Mom(String name, String birthday) {
        super(name, birthday);
    }

    public void setTimeInOffice(int timeinoffice) {
        this.TimeInOffice = timeinoffice;
    }

    public int getTimeInOffice() {
        return TimeInOffice;
    }

    @Override
    public void movement() {
        System.out.println( getName() + " пришла");
        atHome = true;
    }

    @Override
    public void say() {
        if (getEmotion().equals(Emotions.ANGRY))
            System.out.println("Малыш, где бегония?! Почему дома потоп? - " + getEmotion().toString() + " сказала " + getName());
        else System.out.println("Здравствуй, сынок! Я дома " + getEmotion().toString() + " сказала " + getName());
    }

    @Override
    public void LeaveHome() {
        System.out.println( getName() + " ушла в бюро путешествий");
        atHome = false;
    }
    public boolean isAtHome() {
        return atHome;
    }

}
