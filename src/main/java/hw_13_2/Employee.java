package hw_13_2;

public class Employee extends BaseEmployee {
    public Employee(String name, int age, boolean isMale, int dailySalary){
        super(name, age, isMale, dailySalary);
    }
    @Override
    public int getSalary(Month[] monthArray){
        int sum = 0;
        for(int i = 0; i < monthArray.length; i++){
            sum += monthArray[i].getWorkDays();
        }
        return sum * getDailySalary();
    }
}
