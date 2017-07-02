//test to validate if webelement is hidden after an option is selected

package pt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementsvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To use chrome we have to setProperty 
		System.out.println("Test has been initiated");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POONAM TARE\\Desktop\\setups\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");//opens this URL
		//checks to find out whether the webelement return is present on the webpage or not
		System.out.println("Before clicking on multicity button");
		System.out.println(driver.findElement(By.id("hp-widget__return")).isDisplayed());
		//selects the multi way option
		driver.findElement(By.xpath("//*[@id=\"js-switch__option\"]/div[3]/label")).click();
		//checks  to find out whether the webelement return is present on the webpage or not
		//since multiway has been selected, the return option gets hidden and this
		//second print statement return false
		System.out.println("After clicking on multicity button");
		System.out.println(driver.findElement(By.id("hp-widget__return")).isDisplayed());
		// To check whether a webelement is present in code base or not, we alter to some non existing xpath as shown below
		/*int count = driver.findElements(By.xpath("//*[@id=\\\"__option\\\"]/div[3]/label")).size();
		if (count == 0 )
		{
		System.out.println("Verified that the web element is not present");
		}
		*/
		// to verify and get the text from a particular location on page
		System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-banner\"]/div[1]/div/div[6]/div/section/h4")).getText());
	}

}
