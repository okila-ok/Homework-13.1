package hw_13_2;

public class MonthUtils {
    public static final Month JANUARY = new Month("January", 31, 20);
    public static final Month FEBRUARY = new Month("February", 28, 19);
    public static final Month MARCH = new Month("March", 31, 23);
    public static final Month APRIL = new Month("April", 30, 20);
    public static final Month MAY = new Month("May", 31, 22);
    public static final Month JUNE = new Month("June", 30, 21);
    public static final Month JULY = new Month("July", 31, 20);
    public static final Month AUGUST  = new Month("August", 31, 23);
    public static final Month SEPTEMBER = new Month("September", 30, 20);
    public static final Month OCTOBER = new Month("October", 31, 21);
    public static final Month NOVEMBER = new Month("November", 30, 20);
    public static final Month DECEMBER = new Month("December", 31, 20);

    public static final Month[] months = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
            NOVEMBER, DECEMBER};

    public static Month[] getQuarter(byte quarter){
        if(quarter == 1){
            return new Month[]{JANUARY, FEBRUARY, MARCH};
        }
        else if(quarter == 2){
            return new Month[]{months[3], months[4], months[5]};
        }
        else if(quarter == 3){
            return new Month[]{months[6], months[7], months[8]};
        }
        else return new Month[]{months[9], months[10], months[11]};
    }

    public static Month[] getQuarterImproved(int quarter){  // quarter is quarter of year (1, 2, 3, 4)
        int n = 3 * quarter - 3; // n is monthNumber - 1
        return new Month[]{months[n], months[n + 1], months[n + 2]};
    }

    public static Month[] getQuarterForLoop(int quarter){
        int n = 3 * quarter - 3;
        Month[] mnths = new Month[3];
        for (int i = n, j = 0; i < n + 3; i++, j++){
            mnths[j] = months[i];
        }
        return mnths;
    }

    public static Month[] getHalfYear(int halfYear){
        int n = 6 * halfYear - 6;
        return new Month[]{months[n], months[n + 1], months[n + 2], months[n + 3],
                           months[n + 4], months[n + 5]};

        }
    public static Month[] getAllMonths(){
        return months;
        }

    }

