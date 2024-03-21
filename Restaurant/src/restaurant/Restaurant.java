
package restaurant;

import restaurant.food.Dish;
import restaurant.food.Menu;
import restaurant.people.Customer;
import restaurant.values.CustomerRole;
import restaurant.values.DishType;
import restaurant.values.DishVariation;




public class Restaurant {
    
    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "123");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "456");
        administrative.sellFood();
        
        Menu menu = new Menu();
        
        Dish dish1 = new Dish("Huevos pericos", DishType.BREAKFAST, 20, 2400, DishVariation.OPTION1);
        Dish dish2 = new Dish("caldo con arepa", DishType.BREAKFAST, 20, 2400, DishVariation.OPTION2);
        
        menu.addDish(dish1);
        menu.addDish(dish2);
        
        menu.showMenu();
       
    }
    
}
