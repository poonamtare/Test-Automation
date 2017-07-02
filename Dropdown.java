package pt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a select function to deal with the static dropdown menu
		System.out.println("Test has been initiated");
		// In order to use Chrome Browser we need to add this exe file using System.setProperty
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POONAM TARE\\Desktop\\setups\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// open browser
		driver.get("http://book.spicejet.com/Search.aspx");// to open up the URl
		//to select the dropdown element on the webpage
		Select s = new Select(driver.findElement(By.id("ControlGroupPromotionHomeView_AvailabilitySearchInputPromotionHomeView_DropDownListPassengerType_ADT")));
		//we are passing the value 2 which corresponds to 2 adults
		s.selectByValue("2");
		// selecting by using index
		s.selectByIndex(6);
		//selecting by visible text
		s.selectByVisibleText("5 Adults");
		//Automating dynamic dropdowns 
		driver.findElement(By.id("ControlGroupPromotionHomeView_AvailabilitySearchInputPromotionHomeVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value = 'GOI']")).click();// from location goa
		//control automatically flows so this line is not required: driver.findElement(By.id("ControlGroupPromotionHomeView_AvailabilitySearchInputPromotionHomeViewdestinationStation1_CTXT")).click();
		// to destination Delhi, we need to give the instance [2] as developer has rendered the same code
		//in both the source and destination boxes.
		driver.findElement(By.xpath("(//a[@value = 'DEL'])[2]")).click();
		//code to select the checkboxes on the site
		//to select checkbox
		//driver.findElement(By.xpath("insert it here")).click();
		//in order to verify whether the checkbox has been selected, we use the isSelected function; 
		//test scenarios like whether checkbox is checked by default
		//driver.findElement(By.id("insert it here")).click();
		//System.out.println(driver.findElement(By.id("inse\rt it here")).isSelected()); 
		//if selected then true, if not then false
		
		
	}

}
