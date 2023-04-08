package hw_13_2;

public class Manager extends BaseEmployee {
    private int numberOfSubordinates;
    public Manager(String name, int age, boolean isMale, int dailySalary, int numberOfSubordinates){
        super(name, age, isMale, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int sum = 0;
        for(int i = 0; i < monthArray.length; i++){
            sum += monthArray[i].getWorkDays();
        }
        return (int) (sum * getDailySalary() * (1 + 1/100.0 * getNumberOfSubordinates()));
    }
}
