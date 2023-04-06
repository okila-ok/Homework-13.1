package hwTest_13_1;

import hw_13_1.Director;
import hw_13_1.Employee;
import hw_13_1.Manager;
import hw_13_1.Worker;

public class EmployeeData {
    public static Employee[] getEmployeeData() {
        Employee e1 = new Worker(100, "Monica");
        Employee e2 = new Worker(200, "Phoebe");
        Employee e3 = new Worker(300, "Rachel");
        Employee e4 = new Manager(1000, "Ross", 100);
        Employee e5 = new Manager(2000, "Chandler", 200);
        Employee e6 = new Manager(3000, "Mike", 300);
        Employee e7 = new Director(10000, "Ken", 400);
        Employee e8 = new Director(20000, "Larry", 500);
        Employee e9 = new Director(30000, "Reilly", 700);


        Employee[] employees = {e1, e2, e3, e4, e5, e6, e7, e8, e9};
        return employees;
    }
}
