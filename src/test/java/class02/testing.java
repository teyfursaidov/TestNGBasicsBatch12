package class02;

import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.testng.annotations.*;

public class testing {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is before suite.");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("This is after suite.");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is before test.");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("This is after test.");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class.");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This is after class.");
    }

    @BeforeMethod
    public void before(){
        System.out.println("This is before method.");
    }
    @AfterMethod
    public void after(){
        System.out.println("This is after method.");
    }
    @Test
    public void Test101(){
        System.out.println("Test101 result.");
    }
    @Test
    public void Test102(){
        System.out.println("Test102 result.");
    }
}
