package webtest;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Zaraweb {
	
	WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.zara.com/in"); 

		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
	    //driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.zara.com/in");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement View = driver.findElement(By.xpath("//*[@id=\"I2020-MUJER-ULTIMA_SEMANA-TEXT\"]/div/div/div[3]"));
		View.click();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,4000)");
		WebElement Select = driver.findElement(By.xpath("//*[@id=\"product-60706547\"]/div/div[2]/a"));
		Select.click();
		Thread.sleep(4000);
		WebElement Size = driver.findElement(By.xpath("//*[@id=\"product\"]/div[1]/div/div[2]/form/fieldset/div/div[1]/label[1]"));
		Size.click();
		Thread.sleep(4000);
		WebElement Item = driver.findElement(By.xpath("//*[@id=\"product\"]/div[1]/div/div[2]/form/div/button"));
		Item.click();
		Thread.sleep(4000);
		WebElement Process = driver.findElement(By.xpath("//*[@id=\"product\"]/div[1]/div/div[2]/form/div/a"));
		Process.click();
		Thread.sleep(4000);
		WebElement Continue = driver.findElement(By.xpath("//*[@id=\"main\"]/article/div[2]/form/div/section/div/div[2]/div[3]/button/div"));
		Continue.click();
		Thread.sleep(4000);
		WebElement Purchase = driver.findElement(By.xpath("//*[@id=\"main\"]/article/div/div/section[2]/button"));
		Purchase.click();
		Thread.sleep(4000);
		WebElement Name = driver.findElement(By.id("ti-name"));
		Name.click();
		Name.sendKeys("Pooja Sharma");
		Thread.sleep(4000);
		WebElement Pincode = driver.findElement(By.id("ti-zipcode"));
		Pincode.click();
		Pincode.sendKeys("411028");
		Thread.sleep(4000);
		
		WebElement Address = driver.findElement(By.id("ti-address"));
		Address.click();
		Address.sendKeys("Marvel Arco");
		Thread.sleep(4000);
		WebElement Locality = driver.findElement(By.id("ti-municipality"));
		Locality.click();
		Locality.sendKeys("Amanora");
		Thread.sleep(4000);
		WebElement City = driver.findElement(By.id("ti-city"));
		City.click();
		City.sendKeys("Pune");
		Thread.sleep(4000);
		WebElement State = driver.findElement(By.xpath("//*[@id=\"slct-state\"]"));
		State.click();
		State.sendKeys("Maharashtra");
		Thread.sleep(4000);
		WebElement Email = driver.findElement(By.id("ti-email"));
		Email.click();
		Email.sendKeys("sharma.pooja3888@gmail.com");
		Thread.sleep(4000);
		WebElement Phone = driver.findElement(By.id("mobile-phone"));
		Phone.click();
		Phone.sendKeys("9890679896");
		Thread.sleep(4000);
		WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"main\"]/article/div[2]/div/section/div/div[2]/div[3]/button/div/div[1]"));
		Checkout.click();
		Thread.sleep(4000);
		WebElement Delivery = driver.findElement(By.xpath("//*[@id=\"main\"]/article/div[2]/form/fieldset/div/div/label/div[2]/div/div[1]/div[1]/div"));
		Delivery.click();
		Thread.sleep(4000);
		WebElement Next = driver.findElement(By.xpath("//*[@id=\"main\"]/article/div[2]/form/div/section/div/div[2]/div[3]/button"));
		Next.click();
}
}