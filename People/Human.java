package People;

import Enumeration.Emotions;

public abstract class Human {
    private final String NAME;
    private final String BIRTHDAY;
    private Emotions emotion = Emotions.QUIETLY;

    public Human(String name, String birthday) {
        this.NAME = name;
        this.BIRTHDAY = birthday;
    }

    public String getName() {
        return NAME;
    }

    public String getBirthday() {
        return BIRTHDAY;
    }

    public void setEmotion(Emotions emotion) {
        this.emotion = emotion;
    }

    public Emotions getEmotion() {
        return emotion;
    }

    public abstract void movement();
    public abstract void say();

    @Override
    public int hashCode() {
        return getBirthday().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return getBirthday();
    }
}
