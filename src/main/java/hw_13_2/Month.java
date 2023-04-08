package hw_13_2;

public final class Month {
    private String monthName;
    private int days;
    private int workDays;

    public Month(String monthName, int days, int workDays){
        this.monthName = monthName;
        this.days = days;
        this.workDays = workDays;
    }
     public void setMonthName(String monthName){
        this.monthName = monthName;
     }
    public String getMonthName(){
        return monthName;
    }

    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }

    public int getWorkDays(){
        return workDays;
    }
    public void setWorkDays(int workDays){
        this.workDays = workDays;
    }

}
