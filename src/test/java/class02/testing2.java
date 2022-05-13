package class02;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing2 {

    @BeforeSuite
    public void befSuite(){
        System.out.println("Before SUITE");
    }
    @BeforeTest
    public void befTest(){
        System.out.println("Before TEST");
    }
    @Test
    public void TestA(){
        System.out.println("Testing Class 02 TestA");
    }
    @Test
    public void TestB(){
        System.out.println("Testing Class 02 TestB");
    }
}
