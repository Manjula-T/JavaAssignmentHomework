package week2Day1homeworkassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.findElement(By.className("wp-categories-title")).click();
		driver.findElement(By.id("email")).sendKeys("1manju.t@gmail.com");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input")).isDisplayed();
		//driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input")).isDisplayed();
		//driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input")).isDisplayed();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Button")).click();
		
		//driver.findElement(By.id("home")).click();
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.id("position")).getLocation();;
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.id("color")).getCssValue("color");
	//	System.out.println(driver.getTitle());
	
		driver.findElement(By.id("size")).getSize();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("HyperLink")).click();
		
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		
//		driver.findElement(By.id("position")).getLocation();
//		driver.findElement(By.id("color")).getCssValue("color");
//		
//		driver.findElement(By.id("size")).getSize();
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);
		//driver.findElement(By.id("home")).click();
	//	driver.findElement(By.id("wp-categories-title")).click();
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Go to Home Page")).getSize();
		
		
		
		
	}

}
