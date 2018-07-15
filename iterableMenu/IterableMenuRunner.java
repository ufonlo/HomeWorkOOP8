package Work_8.iterableMenu;

public class IterableMenuRunner {
    public static void main(String[] args) {
        IterableMenu menu = new IterableMenu("Italian summer");
        menu.addDish(new Dish("Margherita", "Italian pizza", 200));
        menu.addDish(new Dish("Carbonara", "Italian pasta", 100));
        menu.addDish(new Dish("Lasagne", "Flat Italian pasta", 130));

        for (Dish dish : menu) {
            System.out.println(dish);
        }

    }
}
//Test
//Dish{name='Margherita', description='Italian pizza', price=200}
//Dish{name='Carbonara', description='Italian pasta', price=100}
//Dish{name='Lasagne', description='Flat Italian pasta', price=130}
//
//Process finished with exit code 0