package pt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test has been initiated");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POONAM TARE\\Desktop\\setups\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:/facebook.com");
		driver.findElement(By.id("email")).sendKeys("poonamtare");
		driver.findElement(By.name("pass")).sendKeys("abcdefgh");
		//driver.findElement(By.className("sbibod")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();

	}

}
