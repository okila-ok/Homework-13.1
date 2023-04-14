package interfacearraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//      Employee wr1 = new Worker("Adams", 200);
//      Employee man1 = new Manager("Xavier", 2000, 200);
 //     we can now use interface Salary instead of Employee parent class to create objects; we can also use it to create an array:

        Salary wr1 = new Worker("Adams", 200);
        Salary man1 = new Manager("Xavier", 2000, 200);

        Salary[] salaries = {wr1, man1};

        for (Salary elem : salaries) {
            System.out.println(elem.getSalary());
        }

//      ArrayList<Salary> arr = new ArrayList<>(); // ArrayList is a class, List is an interface, so in line 23, we did
                                                   // the same thing as we did in lines 8 - 13;
        List<Salary> arr = new ArrayList<>();      // new ArrayList: here, ArrayList is a constructor, we can't remove
                                                   // Array part from it to make it new List<>()


        arr.add(wr1);
        arr.add(man1);

        for (Salary elem: arr) {
            System.out.println(elem.getSalary());
        }
   }
}
