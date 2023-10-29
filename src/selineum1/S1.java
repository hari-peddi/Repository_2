package selineum1;


	//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

;
	



public class S1 {
	

	
	public static void main(String[] args) throws InterruptedException /*throws Exception*/ { 

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-extensions");
		opt.addArguments("--start-maximized");
		  //Test Case Steps
	System.setProperty("webdriver.chrome.driver",
		      "E://chromedriver.exe");
	WebDriver driver = new ChromeDriver(opt);
	Thread.sleep(5000);
	driver.get("https://www.youtube.com");
	Thread.sleep(5000);
	driver.close();	
	}

}



