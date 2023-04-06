package hw_13_1;

public class Worker extends Employee{
    public Worker(int baseSalary, String name){
        super(baseSalary, name);
    }
    @Override
    public final int getSalary() {
        return getBaseSalary();
    }
}
