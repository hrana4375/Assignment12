
package questions;
import java.util.*;

public class Generics {
     static <T> void sort(T[] a) 
     {
         Arrays.sort(a);
         for (T a1 : a) {
             System.out.print(a1+" ");
         }  
         System.out.println();
     }
       
           public static  void main(String args[]) {
               Integer arr[] = {56,234,84,12,46,75};
               Float ar[] = {12.3f,56.66f,45.2f,51.35f,4.5f,56.2f};
               sort(arr);
               sort(ar);
               
           }
    }
            
    

