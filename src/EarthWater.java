import java.util.Objects;

public class EarthWater extends Animals {

    public EarthWater(String name, Integer age, String environment) {
        super(name, age, environment);
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }


    @Override
    void eat() {
        System.out.println("Я ем разную еду");
    }

    @Override
    void go() {
        System.out.println("Я передвигаюсь по воде и суше");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EarthWater a = (EarthWater) o;
        return Objects.equals(getName(), a.getName());
    }
}
