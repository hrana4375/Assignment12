
package questions;

public class Generics_Show {
    static<T> void print(T[] a) {
        for(T abc : a) {
            System.out.print(abc+" ");
        }
         System.out.println();
            
    }
    public static void main(String args[])
    {
     Integer arr[] = {1,43,22,67,21};
     Float ar[] = {5.6f,3.56f,23.45f,64.56f};
     print(arr);
     print(ar);
        
    }
    
}
