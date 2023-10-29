package selineum1;

//To access webdriver classes & methods
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
//To access firefox browser
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	//To access obj:methods
	import org.openqa.selenium.By;

public class S2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver",
		        "E:\\geco_driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://youtube.com/"); 
		driver.findElement(By.name("search_query")).sendKeys("jojo D A N C I N");
		Thread.sleep(3000);
		//  driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		WebElement w = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
		w.click();
		Thread.sleep(3000);
		driver.close();
		

		WebDriver d = new FirefoxDriver();		
		d.navigate().to("https://mangatoto.com/title/114157/");    //  https://bato.to/series/19516
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.linkText("Chapter 1")).click();
		String Title = d.getTitle();
		String title_1 = "Sakamoto Desu ga? (Official) - Read Free Manga Online at Bato.To";
		String title_2 = "Sakamoto Desu ga? (Official) - Chapter 1 - Read Free Manga Online at Bato.To";
		d.close();
		if (Title.equals(title_1) || Title.equals(title_2)) {System.out.println("Title match");  }
		else { System.out.println("Check it again with nasa");  }
		
		


	}

}
