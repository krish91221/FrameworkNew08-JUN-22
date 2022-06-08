package com.crm.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridSample {
	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("https://192.168.0.114:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("https://www.facebook.com");

	}
}