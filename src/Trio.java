
public class Trio {
    private Sandwich sandwich;
    private Drink drink;
    private Salad salad;
    private double price;
    private String name;
    public Trio(Sandwich sandwitch, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.drink = drink;
        this.salad = salad;
        this.name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
        this.price = getPrice();
    }
    public double getPrice(){
        double sandwichPrice = this.sandwich.getPrice();
        double saladPrice = this.salad.getPrice();
        double drinkPrice = this.drink.getPrice();
        if(sandwichPrice > drinkPrice){
            if(drinkPrice > saladPrice){
                return sandwichPrice + drinkPrice;
            }
            else return saladPrice + saladPrice;
        }
        else if(sandwichPrice > saladPrice){
            return  sandwichPrice + drinkPrice;
        }
        else return saladPrice + drinkPrice;
    }
    public String getName() {return this.name;}
}
