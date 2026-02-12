package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("(//input[@name = 'companyName'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys("Kani Muthu");
		driver.findElement(By.xpath("(//input[@name = 'lastName'])[3]")).sendKeys("Karthick");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kani");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Training Institute");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kk@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0000011111");
		
		WebElement stateDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state =new Select(stateDD);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("abc");
		driver.findElement(By.className("smallSubmit")).click();
						
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		

	}

}
