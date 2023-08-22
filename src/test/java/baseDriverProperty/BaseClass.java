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
import java.util.Date;

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

    //@Test
    //public void takeScreenshotTest() {
        //Assert.assertEquals(false, true);
    //}

    public void FailedScreenshot(String testMethod) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date d = new Date();

        String TimeStamp = d.toString().replace(":", "_").replace(" ", "_");
        try{
            FileUtils.copyFile(scrFile, new File("C:\\intellij\\QualityPirates_DsAlgo\\ScreenShots" + testMethod + "_" + TimeStamp + "_" + ".jpg"));
        } catch (IOException e)  {
            e.printStackTrace();
        }
    }

}
