package Qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		System.out.println("omkar");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
       
        new FirefoxDriver();
	}

}
