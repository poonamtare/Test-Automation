package pt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test to use the javascript pop ups which cannot be detected by selenium.Selenium can only detect HTML web elements.
//We use the alert class to detect these elements.
public class alertsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To use chrome we have to setProperty 
		System.out.println("Test has been initiated");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POONAM TARE\\Desktop\\setups\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		//to switch the control from browser to the pop up, the alert class is used
		//to validate the text in the pop up
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//accept is used or the positive scenario
		//driver.switchTo().alert().dismiss();
		//dismiss is used for negative scenarios
		 //if there is some edit box in the pop up and have to enter sometext
		//driver.switchTo().alert().sendKeys("your text here");
		

	}

}
