
import java.util.Objects;

public class Hunter extends Mammalia {

    private static final String foodType = "Все подряд";

    public Hunter(String name, Integer age, Integer speed) {
        super(name, age, speed, foodType);
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hunter a = (Hunter) o;
        return Objects.equals(getName(), a.getName());
    }

    @Override
    void go() {
        System.out.println("Я ем все");
    }
}
