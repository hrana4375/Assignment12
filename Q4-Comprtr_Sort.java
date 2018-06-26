
package questions;
import java.util.*;

 class Man {
    String name;
    int age;
    Man(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }       
}
class Name_Comp implements Comparator<Man>{

    public int compare(Man t, Man t1) {
        return t.getName().compareTo(t1.getName());
    }   
}
class Age_Comp implements Comparator<Man>{

    public int compare(Man t, Man t1) {
        return t.getAge()-t1.getAge();
    }   
}

public class Comprtr_Sort {
    public static void main(String args[]) {
    Man m1 = new Man("Himanshu",19);
    Man m2 = new Man("Harshit",20);
    Man m3 = new Man("Gagan",18);
    Man m4 = new Man("Vivek",19);
    ArrayList<Man> al = new ArrayList();
    
    al.add(m1);
    al.add(m2);
    al.add(m3);
    al.add(m4);
    
    Name_Comp ob = new Name_Comp();
    Age_Comp ob1 = new Age_Comp();
    
    Collections.sort(al, ob);
    System.out.println("Sorting based on Name: \n");
    for(Man m : al) 
        System.out.println(m.getName() +"  "+ m.getAge());
    
    Collections.sort(al, ob1);
        System.out.println("Sorting based on Age: \n");
    for(Man m : al) 
        System.out.println(m.getName() +"  "+ m.getAge());
    }
}

   
