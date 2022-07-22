package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mails {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/apmosys/Desktop/chromedriver_linux64 (5)/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.apmosys.com/webmail/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/main/form/div/div/section[2]/label/input")).sendKeys("nandini.gorule@apmosys.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name=\"next\"]")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Welcome@2022");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@name=\"next\"]")).click();
		
		
		
	}

}
