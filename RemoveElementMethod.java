import java.util.ArrayList;  
  
public class RemoveElementMethod {  
   public static void main(String[] args) {  
        
      
      ArrayList<String> arr = new ArrayList<String>(5);  
  
      // Adding elements to the ArrayList  
      arr.add("Helen");  
      arr.add("Paul");  
      arr.add("Elanie");  
      arr.add("Marco");   System.out.println("The list of the size is: " + arr.size());   for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
        
      // Removing the specified element from ArrayList  
      arr.remove("Paul");  System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}