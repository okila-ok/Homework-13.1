package hwtest_13_2;

import hw_13_2.Month;
import hw_13_2.MonthUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import static hw_13_2.MonthUtils.*;

public class MonthTest {

    @Test

    public void checkGetQuarterImproved(){
        Assert.assertEquals(MonthUtils.getQuarterImproved(1), new Month[]{JANUARY, FEBRUARY, MARCH});
        Assert.assertEquals(MonthUtils.getQuarterImproved(2), new Month[]{APRIL, MAY, JUNE});
        Assert.assertEquals(MonthUtils.getQuarterImproved(3), new Month[]{JULY, AUGUST, SEPTEMBER});
        Assert.assertEquals(MonthUtils.getQuarterImproved(4), new Month[]{OCTOBER, NOVEMBER, DECEMBER});
    }

    @Test
    public void checkGetHalfYear(){
        Assert.assertEquals(MonthUtils.getHalfYear(1), new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE});
        Assert.assertEquals(MonthUtils.getHalfYear(2), new Month[]{JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER});
    }

    @Test
    public void checkGetQuarterForLoop(){
        Assert.assertEquals(MonthUtils.getQuarterForLoop(1), new Month[]{JANUARY, FEBRUARY, MARCH});
        Assert.assertEquals(MonthUtils.getQuarterForLoop(2), new Month[]{APRIL, MAY, JUNE});
    }

    @Test
    public void checkGetAllMonths(){
        Assert.assertEquals(MonthUtils.getAllMonths(), new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER});
    }
}
