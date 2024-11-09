import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cartify {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cartify.pk/");
		WebElement element = driver.findElement(By.xpath("//span[text()='Shop By Categories']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//div[contains(text(),'Cloth')]")).click();
		WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Floor')]"));
	    executor.executeScript("arguments[0].click();", element2);
Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='add']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
		String text = driver.findElement(By.xpath("//span[text()='Rs.10,500.00 PKR']")).getText();
		System.out.println(text);
		
		driver.quit();
		
}
}
