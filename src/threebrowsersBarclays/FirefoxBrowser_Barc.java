package threebrowsersBarclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowser_Barc {

    public static void main(String[] args) {            // main method

        // defining the url to check
        String baseUrl = "https://www.barclays.co.uk/";

        // setting up the webdriver
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // maximisixing the window vew size / setting delay time in opening the website
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // getting the baseURl
        driver.get(baseUrl);

        // getting the title of the url page
        String title = driver.getTitle();
        System.out.println("Main page : " + title);     // print main page title
        System.out.println(driver.getTitle());          // print title page name

        driver.quit();                                    // exiting the url.
    }
}
