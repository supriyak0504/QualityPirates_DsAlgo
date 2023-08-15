package baseDriverProperty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;


    public static WebDriver getDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        return driver;
    }

    public static WebDriver setDriver() {
        BaseClass.driver = driver;
        return driver;
    }

    @Test
    public void takeScreenshotTest() {
        Assert.assertEquals(false, true);
    }

    public void failed() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(scrFile, new File("failshot_"+this.getClass().getName()+"_"+".jpg"));
        } catch (IOException e)  {
            e.printStackTrace();
        }
    }

}
