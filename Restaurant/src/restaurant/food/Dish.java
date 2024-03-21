
package restaurant.food;
import restaurant.values.DishType;
import restaurant.values.DishVariation;


public class Dish {
    String name;
    DishType type;
    int stock;
    int price;
    DishVariation variation;
    
    public Dish(String name, DishType type, int stock, int price, DishVariation variation){
        this.name = name;
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.variation = variation;
    
    }
    
    public String getName(){
        System.out.println("a");
    }
    
    public String getType(){
        System.out.println("a");
    }
      
}
