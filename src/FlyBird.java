import java.util.Objects;

public class FlyBird extends Bird{

    private static final String envin = "Везде";
    private static final String moveType = "взмах крыльев";

    public FlyBird(String name, Integer age) {
        super(name, age,moveType, envin);
    }

    public void fly() {
        System.out.println("Я летаю");
    }

    @Override
    void eat() {
        System.out.println("Приземляюсь и ем");
    }

    @Override
    void go() {
        System.out.println("Я машу крыльями");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyBird a = (FlyBird) o;
        return Objects.equals(getName(), a.getName());
    }
}
