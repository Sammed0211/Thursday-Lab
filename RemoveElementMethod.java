import java.util.ArrayList;  
  
public class RemoveElementMethod {  
   public static void main(String[] args) {  
        
      
      ArrayList<String> arr = new ArrayList<String>(5);  
  
      // Adding elements to the ArrayList  
      arr.add("sammed");  
      arr.add("omkar");  
      arr.add("santosh");  
      arr.add("sumit");   System.out.println("The list of the size is: " + arr.size());   for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
        
      // Removing the specified element from ArrayList  
      arr.remove("omkar");  System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}