package interfacearraylist;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates){
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public int getSalary(){
        return (int)(getBaseSalary() * (1 + numberOfSubordinates * 3/100.0));
    }
}
