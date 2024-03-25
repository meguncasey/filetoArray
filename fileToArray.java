import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;
public class fileToArray { 

public static void main(String[] arguments)
 {

List<String> list = new ArrayList <String>(); 
list.add(" Jerry green"); 
list.add(" Bob go");
list.add("jon");
list.add("ste");
list.add("seb");
list.add("gary"); 
list.add("Grog"); 


 for (int i = 0; i < list.size(); i++) {
     System.out.println(list.get(i)); 
}
}
}