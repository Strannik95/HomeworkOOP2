 abstract class Mammalia extends Animals {
     private final Integer speed;
     private final String foodType; //также вынесла из дочерних классов

     public Mammalia(String name, Integer age, Integer speed, String foodType) {
         super(name, age, "Суша");
         if (speed == null || speed <= 0) {
             throw new IllegalArgumentException("Некорректные данные");
         } else {
             this.speed = speed;
         }
         if (foodType == null || foodType.isBlank()) {
             throw new IllegalArgumentException("Некорректные данные");
         } else {
             this.foodType = foodType;
         }
     }

     public Integer getSpeed() {
         return speed;
     }

     public String getFoodType() {
         return foodType;
     }

     public void walk() {
         System.out.println("Я гуляю");
     }

     @Override
     public void eat() {
         System.out.println("Я ем " + getFoodType());
     }

     @Override
     public String toString() {
         return super.toString() + ", скорость " + speed + ", тип пищи " + foodType;
     }
 }