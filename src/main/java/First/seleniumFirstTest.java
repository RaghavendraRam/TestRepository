package First;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class seleniumFirstTest {
  @Test
  public void f() {
	  //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver-v0.16.1-win64\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
  	
      String baseUrl = "http://www.facebook.com";
      

      // launch Fire fox and direct it to the Base URL
      driver.get(baseUrl);

      // get the actual value of the title
     
      /*
       * compare the actual title of the page with the expected one and print
       * the result as "Passed" or "Failed"
       */
      
     
      //close Fire fox
      driver.close();
  }
}
