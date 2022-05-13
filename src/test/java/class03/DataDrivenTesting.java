package class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataDrivenTesting {
    WebDriver driver;
    @DataProvider(name = "Credentials")
    public Object[][] data() {
        Object[][] login = {
                {"Admin", "abc", "Invalid credentials"},
                {"Ad", "Hum@nhrm123", "Invalid Credentials"},
                {"Admin", "", "Password cannot be empty"},
                {"", "Hum@nhrm123", "Username cannot be empty"}};
        return login;
    }

    @Test(dataProvider = "Credentials")
    public void loginWithVariousCredentials(String userName, String pass, String ErrorMSG){
        /*System.out.println("the username is: "+userName);
        System.out.println("the password is: "+pass);
        System.out.println("the error message is: "+ErrorMSG);*/
        SoftAssert soft = new SoftAssert();
        WebElement Username = driver.findElement(By.id("txtUsername"));
        Username.sendKeys(userName);
        driver.findElement(By.id("txtPassword")).sendKeys(pass);
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        // make assertion
        soft.assertEquals(text,ErrorMSG);
        soft.assertAll();
    }

    @BeforeMethod(alwaysRun = true)
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }
    @AfterMethod(alwaysRun = true)
    public void CloseBrowser() {
        driver.quit();
    }


}
