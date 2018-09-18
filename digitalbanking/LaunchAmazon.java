package com.digitalbanking;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/swapniljadhav/Downloads/chromedriver");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://www.amazon.in");
	}

}
