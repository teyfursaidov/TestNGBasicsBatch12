package class01;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void login(){
        System.out.println("This is login");
    }

    @Test(dependsOnMethods = "login")
    public void verificationDashboard(){
        System.out.println("This is dashboard");
    }
}
