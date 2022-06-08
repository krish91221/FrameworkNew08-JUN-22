package com.crm.practice;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.comcast.GenericFunctionalities.DataRead;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactandhandledropdownScript {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		//setting to launch chrome browser
		DataRead d=new DataRead();
		d.getFile();
		//launching chrome browser
		WebDriver driver =d.driver;
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//LAUNCHING THE VTIGER APPLICATION
		driver.get(d.UrL);

		//login to application
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(d.UserName);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(d.Password);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		WebDriverWait wait=new WebDriverWait(driver,10);
		//click on contacts link
		WebElement contact=driver.findElement(By.xpath("//a[.='Contacts'] "));

		wait.until(ExpectedConditions.visibilityOf(contact));
		Thread.sleep(2000);
		contact.click();

		//click on add contact

		driver.findElement(By.xpath(" //img[@title='Create Contact...']")).click();

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Krishna");


		driver.findElement(By.xpath("//input[@value='T']")).click();

		WebElement seldd = driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
		Select sel=new Select(seldd);
		sel.selectByValue("4");
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();

		//Logout
		Thread.sleep(2000);
		WebElement acc=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(acc).perform();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();

		//close application
		driver.close();

	}
}
