package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledAndDisabled {
    @Test(enabled = false)
    public void firstTest() {
        System.out.println("This is my first testcase.");
    }

    @Test(enabled = true)
    public void secondTest() {
        System.out.println("This is my second testcase");
    }

    @Test(enabled = true)
    public void thirdTest() {
        System.out.println("This is my third testcase");
    }

    @BeforeMethod(enabled = true)
    public void beforeMethod() {
        System.out.println("***I am Preconditioned***");
    }

    @AfterMethod(enabled = false)
    public void afterMethod() {
        System.out.println("***I am Post-condition***");
    }
}
