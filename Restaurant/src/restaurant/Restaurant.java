
package restaurant;

import restaurant.food.Menu;


public class Restaurant {
    
    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "a");
        administrative.sellFood();
        
        Menu menu = new Menu();
        
        Dish dish1 = new Dish("Huevos pericos", DishType.BREAKFAST, 20, 2400, DishVariation.OPTION1);
        Dish dish2 = new Dish("caldo con arepa", DishType.BREAKFAST, 20, 2400, DishVariation.OPTION2);
        
        menu.addDish(dish1);
        menu.addDish(dish2);
        
        menu.showMenu();
       
    }
    
}
