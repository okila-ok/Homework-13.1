package hw_13_1;

public abstract class Employee {

    private int baseSalary;
    private String name;

    public Employee(int baseSalary, String name){
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract int getSalary();

    @Override
    public String toString() {
        return "hw_13_1.Employee{" +
                "baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                '}';
    }
}
