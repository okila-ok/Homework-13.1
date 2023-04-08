package hwtest_13_2;

import hw_13_2.BaseEmployee;
import hw_13_2.Employee;
import hw_13_2.Manager;

public class EmployeeData {
    public static BaseEmployee emp = new Employee("Enid", 27, false, 100);
    public static BaseEmployee man = new Manager("Xavier", 28, true, 2000, 20);
    public static BaseEmployee[] allEmployees = {emp, man};
}
