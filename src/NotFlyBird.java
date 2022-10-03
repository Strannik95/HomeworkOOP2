import java.util.Objects;

public class NotFlyBird extends Bird{


    private static final String envi = "в разных местах";
    private static final String moveType = "на ногах";


    public NotFlyBird(String name, Integer age) {
        super(name, age, moveType, envi);
    }

    public void walk() {
        System.out.println("Я гуляю ногами");
    }

    @Override
    void eat() {
        System.out.println("Я ищу пищу на земле и ем");
    }

    @Override
    void go() {
        System.out.println("Я передвигаю ноги");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotFlyBird a = (NotFlyBird) o;
        return Objects.equals(getName(), a.getName());
    }
}
