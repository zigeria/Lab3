package Free;

import java.time.LocalDate;

public class Today {
    private final LocalDate today = LocalDate.now();

    @Override
    public String toString() {
        if (today.getMonthValue() < 10 && today.getDayOfMonth() < 10)
            return "0" + today.getDayOfMonth() + "." +  "0" + today.getMonthValue();
        else if (today.getMonthValue() < 10 && today.getDayOfMonth() > 9)
            return  today.getDayOfMonth() + "." + "0" + today.getMonthValue();
        else if (today.getMonthValue() > 9 && today.getDayOfMonth() < 10)
            return "0" + today.getDayOfMonth() + "." +  today.getMonthValue();
        else return today.getDayOfMonth() + "."  + today.getMonthValue();
    }

    @Override
    public int hashCode() {
        return today.toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else return this.toString().equals(obj.toString());
    }
}
