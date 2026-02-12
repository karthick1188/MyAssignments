package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountAssignmentusingselect {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select industry=new Select(industryDD);
		industry.selectByValue("IND_SOFTWARE");
		
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select ownership=new Select(ownershipDD);
		ownership.selectByVisibleText("S-Corporation");
		
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select source=new Select(sourceDD);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingcampaignDD = driver.findElement(By.id("marketingCampaignId"));
		Select marketingcampaign=new Select(marketingcampaignDD);
		marketingcampaign.selectByIndex(6);	
		
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state=new Select(stateDD);
		state.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
				

	}

}
