package 4th_lesson;


public class Main {
    public static void main(String[] args) {

        DrinkMachine<Drink> drink = new DrinkMachine<>();
        DrinkMachine<HotDrink> hotDrink = new DrinkMachine<>();
        drink.setProduct(new Drink("lemonade", 200));
        drink.setProduct(new Drink("tarragon", 200));
        hotDrink.setProduct(new HotDrink("tea", 300, 65));
        hotDrink.setProduct(new HotDrink("coffe", 200, 80));

        drink.finishProduct();
        hotDrink.finishProduct();
        
    }
}