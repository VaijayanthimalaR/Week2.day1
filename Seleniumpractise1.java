package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumpractise1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		//Webdriver get
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Webdriver Manage
		driver.manage().window().maximize();

		//Webdriver Findelement
		//Web Elements Sendkeys (enter and append text)
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");;
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Web Elements Click
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("leaf");;
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("test");
		
		//Find the element of Select Tag
		WebElement selct=driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Convert the element into select class
		Select st=new Select(selct);
		//find the value from dropdown
		st.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.className("smallSubmit")).click();

		//Web Elements gettext
		String name=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(name);

		//Web Elements isEnabled
		//Web Elements Clear
		//Web ELements attribute(id)- to get the value in text field
		//Web Elements isDisplayed

		//Webdriver gettitle
		String title=driver.getTitle();
		System.out.println(title);

		//Webdriver getcurrenturl
		String url=driver.getCurrentUrl();
		System.out.println(url);

		//Webdriver close
		driver.close();

	}

}
