package utilities;

import baseDriverProperty.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver= BaseClass.getDriver();


    @Before
    public void setup() {
        //   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //    driver.manage().window().maximize();
        System.out.println("This is before class CAll Do something before ");
    }

    @AfterAll
    public void tearDown() {
        //  PageFactory.initElements(driver,this);
        System.out.println("This is after class CAll");
        driver.close();
        driver.quit();
    }
}
