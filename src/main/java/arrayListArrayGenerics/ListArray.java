package arrayListArrayGenerics;
import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Toyota");
        list.add("Tesla");
        list.add("Lexus");
        list.add("BMW");
        list.add("Mustang");

        System.out.println(list);
        System.out.println("---------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(22);
        numbers.add(312);

        System.out.println(numbers);

        Employee<Integer, Character> emp1 = new Employee<>("Monica", 100, 's');
        Employee<Double, String> emp2 = new Employee<>("Chandler", 200.0, "d");
        Employee<Integer, Boolean> emp3 = new Employee<>("Ross", 300, true);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println(employees.get(0).toString());

        Employee<Integer, String> emp4 = new Employee<>("Monica", 100, "s");
        Employee<Integer, String> emp5 = new Employee<>("Chandler", 200, "m");
        List<Employee<Integer, String>> employees1 = new ArrayList<>();
        employees1.add(emp4);
        employees1.add(emp5);

        for (Employee elem : employees1) {
            System.out.println(elem.toString());
        }

        // casting

        List<String> casting = new ArrayList<>();
        ArrayList<String> casting1 = (ArrayList<String>) list;


    }
}