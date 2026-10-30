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
		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Pro Max (Natural Titanium, 1 TB)']")).click();
		driver.close();

	}

}
