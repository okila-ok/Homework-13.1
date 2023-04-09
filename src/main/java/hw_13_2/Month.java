package hw_13_2;

public class Month {  // to make class immutable, remove setters - setters removed
    private String monthName;
    private int days;
    private int workDays;

    public Month(String monthName, int days, int workDays){
        this.monthName = monthName;
        this.days = days;
        this.workDays = workDays;
    }
    public String getMonthName(){
        return monthName;
    }

    public int getDays() {
        return days;
    }

    public int getWorkDays(){
        return workDays;
    }

}
