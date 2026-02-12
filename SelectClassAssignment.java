package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAssignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Siva");
		driver.findElement(By.name("lastname")).sendKeys("Ram");
		driver.findElement(By.name("reg_email__")).sendKeys("sivaram@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("test@2026");
		
		WebElement dayDD = driver.findElement(By.id("day"));
		Select day=new Select(dayDD);
		day.selectByValue("21");
		WebElement monthDD = driver.findElement(By.id("month"));
		Select month=new Select(monthDD);
		month.selectByValue("1");
		WebElement yearDD = driver.findElement(By.id("year"));
		Select year=new Select(yearDD);
		year.selectByValue("1995");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
				
	}

}
