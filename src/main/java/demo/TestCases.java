package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        System.out.println("Start Test case: testCase01");
        // Navigate to https://in.bookmyshow.com/explore/home/chennai  
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        // Get the count of hyperlinks Using Locator "XPath" //a[@href] and use size() to get count
        List<WebElement> hyperlinks = driver.findElements(By.xpath("//a[@href]"));
        System.out.println("Count of Hyperlinks is "+Integer.toString(hyperlinks.size()));
        // Print the count  
        System.out.println("End Test case: testCase01");
    }


}
