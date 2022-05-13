package class01;

import org.testng.annotations.Test;

public class priority {
    @Test(priority = 3)
    public void first() {
        System.out.println("First test.");
    }
    @Test(priority = 2)
    public void second() {
        System.out.println("Second test.");
    }
    @Test(priority = 1)
    public void third() {
        System.out.println("Third test.");
    }

}
