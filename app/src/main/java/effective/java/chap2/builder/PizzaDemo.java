package effective.java.chap2.builder;

public class PizzaDemo {
    public static void main(String[] args) {
        NYPizza pizza = new NYPizza.Builder(NYPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside().build();
    }
}
