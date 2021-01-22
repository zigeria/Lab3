package Enumeration;

public enum Emotions {
    QUIETLY("спокойно"),
    HAPPINESS(" восторженно"),
    SADLY(" грустно"),
    SURPRISED(" с удивлением"),
    AFRAID(" напуганно"),
    SHAMEFULLY(" стыдно"),
    ANGRY(" сердито");

    private String s;
    Emotions (String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

}
