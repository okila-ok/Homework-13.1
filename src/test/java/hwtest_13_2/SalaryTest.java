package hwtest_13_2;

import hw_13_2.MonthUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTest {

    @Test

    public void checkAnnualSalaryEmployee(){
        Assert.assertEquals(EmployeeData.emp.getSalary(MonthUtils.months), 24900);
    }

    @Test
    public void checkQuarterSalaryEmployee(){
        Assert.assertEquals(EmployeeData.emp.getSalary(MonthUtils.getQuarterForLoop(2)), 6300);
    }

    @Test

    public void checkSemiAnnualSalaryManager(){
        Assert.assertEquals(EmployeeData.man.getSalary(MonthUtils.getHalfYear(1)), 300000);
    }
}
