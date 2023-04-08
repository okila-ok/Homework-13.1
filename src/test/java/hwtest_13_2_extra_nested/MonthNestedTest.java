package hwtest_13_2_extra_nested;

import hw_13_2_extra_nested.MonthUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MonthNestedTest {
    MonthUtils monthUtils = new MonthUtils();
    @Test
    public void checkGetMonth(){
        Assert.assertEquals(monthUtils.getMonth(1).getMonthName(), "January");
    }

}
