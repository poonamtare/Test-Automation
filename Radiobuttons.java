package pt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test has been initiated ");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\POONAM TARE\\\\Desktop\\\\setups\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		//to find the count of radio buttons present in this section
		
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		//to find out how many radio buttons are present and want to select the first index
		//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		//the following loop and variable tracks
		//the total number of elements(radio buttons) in the same group tag
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for (int i=0;i<count;i++)
			{
			
			//driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();
			//in case there is no value attribute we use the following method
			String text  =driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			//the above line gets the value name from the value attribute
			if (text.equals("Cheese"))
				{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				}
			}
	}

}
