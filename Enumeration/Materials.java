package Enumeration;

public enum Materials {
    WOOL("Шерсть"),
    SILK("Шелк"),
    VISCOSE("Вискоза"),
    MICROFIBER("Микрофибра"),
    COTTON("Хлопок"),
    LINEN("Лен");

    private String s;
    Materials (String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}