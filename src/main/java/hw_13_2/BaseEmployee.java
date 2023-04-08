package hw_13_2;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private boolean isMale;
    private int dailySalary;

    public BaseEmployee(String name, int age, boolean isMale, int dailySalary){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.dailySalary = dailySalary;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setIsMale(boolean isMale){
        this.isMale = isMale;
    }
    public boolean getIsMale(){
        return isMale;
    }

    public void setDailySalary(int dailySalary){
        this.dailySalary = dailySalary;
    }
    public int getDailySalary(){
        return dailySalary;
    }

    public abstract int getSalary(Month[] monthArray);


}
