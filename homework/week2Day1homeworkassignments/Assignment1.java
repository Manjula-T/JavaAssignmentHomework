package week2Day1homeworkassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println("The Title of the page is:" +title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro Technologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manjula");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavel");
		driver.findElement(By.className("smallSubmit")).click();
		// newurl = driver.getTitle();
		//System.out.println("The Current title of the page is" + newurl);
		//driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro Tecchnologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manjula");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavel");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("DemoClass1");
		WebElement element1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select se = new Select(element1);
		se.deselectByVisibleText("Cold Call");
		WebElement element2 = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		Select se1 = new Select(element2);
		se1.selectByValue("9002");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Manjula");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Thangavel");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("CreateLead");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/5/1992");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ComputerScience");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("ComputerScience");
		WebElement element3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select se2 = new Select (element3);
		se2.selectByVisibleText("DZD - Algerian Dinar");
		WebElement element4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select se3 = new Select (element4);
		se3.selectByVisibleText("IND_AEROSPACE");
		WebElement element5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select se4 = new Select (element5);
		se4.selectByVisibleText("IND_AEROSPACE");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("9879");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5000");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Symbol");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning selenium Locators");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Notes");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9159737722");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Phone number ask for name");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("1manju.t@gmail.com");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("641062");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("GeneralNAme");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("generallastname");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Coimbatore");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("generalCity");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641062");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("PostalCode");
		WebElement element6 =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select se5 = new Select(element6);
		se5.selectByVisibleText("Arkansas");
		WebElement element7 =driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select se6 = new Select(element7);
		se6.selectByVisibleText("Albania");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("91");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
	}

}
