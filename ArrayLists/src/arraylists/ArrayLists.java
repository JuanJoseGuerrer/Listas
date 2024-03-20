
package arraylists;
import java.util.ArrayList;

public class ArrayLists {

    
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        System.out.println(arrayList.size()); //da el tamaño de la lista
        System.out.println(arrayList.isEmpty()); //revisa si la lista esta vacia
        
        //añadir un nuevo elemento
        arrayList.add("hola"); 
        arrayList.add("mundo");
        arrayList.add("cruel");
        
        ArrayList<String> total = new ArrayList<>();
        total.add("nuevo");
        total.addAll(arrayList);
        System.out.println(total);
        
        arrayList.set(2, "bonito");
        arrayList.remove(2);
        
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        
    }
    
}
