package hw_13_2_extra_nested;

public class MonthUtils {

    private final Month JANUARY = new Month("January", 31, 20);
    private final Month FEBRUARY = new Month("February", 28, 19);
    private final Month MARCH = new Month("March", 31, 23);
    private final Month APRIL = new Month("April", 30, 20);
    private final Month MAY = new Month("May", 31, 22);
    private final Month JUNE = new Month("June", 30, 21);
    private final Month JULY = new Month("July", 31, 20);
    private final Month AUGUST  = new Month("August", 31, 23);
    private final Month SEPTEMBER = new Month("September", 30, 20);
    private final Month OCTOBER = new Month("October", 31, 21);
    private final Month NOVEMBER = new Month("November", 30, 20);
    private final Month DECEMBER = new Month("December", 31, 20);
    private Month[] months = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};



    public static class Month {
        private String monthName;
        private int days;
        private int workDays;

        private Month(String monthName, int days, int workDays){
            this.monthName = monthName;
            this.days = days;
            this.workDays = workDays;
        }

        public void setMonthName(String monthName) {
            this.monthName = monthName;
        }

        public void setDays(int days) {
            this.days = days;
        }

        public void setWorkDays(int workDays) {
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
        public Month getMonth(int n){
          return months[n - 1];
        }
}


