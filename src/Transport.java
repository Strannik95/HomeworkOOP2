public abstract class Transport {
    private String brand;
    private String model;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private int maxSpeed;

    public Transport(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "Нет названия";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "Нет названия";
        } else {
            this.model = model;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "Не указана страна";
        } else {
            this.productionCountry = productionCountry;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
            System.out.println("Отрицательная скорость");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "Нет названия";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "Нет названия";
        } else {
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
            System.out.println("Отрицательная скорость");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void refill();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}