public class Drink {
    private String name;
    private  double price;

    public Drink(double price, String name) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}