package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	//Dropdown have select tag
	//Select tag have option tag

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		//Find the element of Select Tag
		WebElement selct=driver.findElement(By.className("ui-selectonemenu"));
		//Convert the element to select class
		Select st=new Select(selct);
		//Choose the element from dropdown based on index
		st.selectByIndex(1);
		//Choose the element from dropdown based on visible text
		st.selectByVisibleText("Playwright");
        // get first selected option
		st.getFirstSelectedOption();
	}

}
