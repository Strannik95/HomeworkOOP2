
    import java.util.Objects;

    public class GrassEater extends Mammalia{
        public GrassEater(String name, Integer age, Integer speed) {
            super(name, age, speed, "Растения");
        }

        public void graze() {
            System.out.println("Я пасусь");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GrassEater a = (GrassEater) o;
            return Objects.equals(getName(), a.getName());
        }

        @Override
        void go() {
            System.out.println("Я перемещаюсь по суше");
        }

    }

