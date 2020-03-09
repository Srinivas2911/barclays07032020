package threebrowsersBarclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorer_Barc {                // class

    public static void main(String[] args) {        // main method
        //setting up the url
        String baseUrl = "https://www.barclays.co.uk/";
        // setting up the webdriver
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        // managing the view and timeout
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);        // getting the url

        // setting up the title page and printing it
        String title = driver.getTitle();
        System.out.println("Main page : "+ title);
        System.out.println(driver.getTitle());

        driver.close();              // quiting the driver
    }
}
