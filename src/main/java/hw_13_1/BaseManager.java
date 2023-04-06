package hw_13_1;

public abstract class BaseManager extends Employee{
    private  int  numberOfSubordinates;
    public BaseManager(int baseSalary, String name, int numberOfSubordinates){
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }
    public abstract int getSalary();
}
