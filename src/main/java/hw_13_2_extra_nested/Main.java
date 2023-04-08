package hw_13_2_extra_nested;

public class Main {
    public static void main(String[] args) {
       // MonthUtils.Month mm = new MonthUtils().new Month("January", 31, 20);  - not working because Month is private
        MonthUtils mu = new MonthUtils();
        System.out.println(mu.getMonth(3).getMonthName());
    }
}
