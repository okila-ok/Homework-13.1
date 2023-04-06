package hwTest_13_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {

    @Test

    public void checkSalary(){
        Assert.assertEquals(EmployeeData.getEmployeeData()[0].getSalary(), 100);
        Assert.assertEquals(EmployeeData.getEmployeeData()[3].getSalary(), 3000);
        Assert.assertEquals(EmployeeData.getEmployeeData()[7].getSalary(), 900000);
    }

    @Test
    public void checkName(){
        Assert.assertEquals(EmployeeData.getEmployeeData()[0].getName(), "Monica");
        Assert.assertEquals(EmployeeData.getEmployeeData()[3].getName(), "Ross");
        Assert.assertEquals(EmployeeData.getEmployeeData()[7].getName(), "Larry");
    }
}
