package com.crm.practice;

import java.net.MalformedURLException;
import java.net.URL;

 import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class GridSample {
	@Test
	public void launch()throws MalformedURLException {
		URL url=new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("http://www.facebook.com");
	}
}