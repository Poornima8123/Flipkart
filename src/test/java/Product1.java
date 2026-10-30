import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchbox =driver.findElement(By.name("q"));
		searchbox.sendKeys("Iphone 15 promax");
		searchbox.submit();
		String mainPage =driver.getWindowHandle();
		System.out.println("Main page ="+mainPage);
		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Pro Max (Natural Titanium, 1 TB)']")).click();
		driver.close();
		
		Set<String> allpages = driver.getWindowHandles();
		for(String page : allpages)
		{
			if(!page.equals(mainPage))
			{
				driver.switchTo().window(page);
			}
				
		}
		System.out.println(driver.getCurrentUrl());

	}

}
