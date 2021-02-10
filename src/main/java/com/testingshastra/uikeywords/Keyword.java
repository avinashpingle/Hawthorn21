package com.testingshastra.uikeywords;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	public void openBrowser(String browser) {
		switch (browser) {
		case "Chrome":
				System.out.println("Opening Chrome browser");
				WebDriverManager.chromedriver().setup();
				Constant.driver=new ChromeDriver();
			break;
		case "Firefox":
			break;
		case "IE":
		break;
		case "Safari":
			break;
		default:
		}
	}
}
