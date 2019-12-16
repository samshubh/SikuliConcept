package sample;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YoutubeConcept {
	
	public static void main(String args[]) throws InterruptedException, AWTException, FindFailed {
		// Setting the path and property of chrome driver
				System.setProperty("webdriver.chrome.driver", "D:\\Subham Files\\chromedriver_win32\\chromedriver.exe");

		// Creating instance of webdriver 
				WebDriver driver = new ChromeDriver();

		      //Maximizing the browser

				driver.manage().window().maximize();

		// clearing the browser cookies

				driver.manage().deleteAllCookies();

		//Setting the page load timeout for the web page 
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		//Enter Url
				driver.get("https://www.google.com/");
				Thread.sleep(4000);

				
				// Create a Screen class object
				   Screen s = new Screen();
				   
				   //Create a pattern class for the google search and click on element by using click method
				   
				   Pattern googleSearchImage = new Pattern("GoogleSearch.PNG");
				   
				   s.wait(googleSearchImage,3000);
				   s.click();
				   s.click();
				   
                  //Create a pattern class for signin and click on sign in button by using click method
				   
				   Pattern signInImage = new Pattern("SignIn.PNG");
				   
				   s.wait(signInImage,3000);
				   s.click();
				   s.click();
				   
                 //Create a pattern class for Email field and enter value by using type method
				   
				   Pattern emailImage = new Pattern("EmailImage.PNG");
				   
				   s.wait(emailImage,3000);
				  s.type("gtmhost6@gmail.com");
				  
				 
				//Create a pattern class for create account field and performing double click by using doubleClick method
				   
				   Pattern createAccount = new Pattern("CreateAccount.PNG");
				   
				   s.wait(createAccount,3000);
				   //s.doubleClick();
				   s.rightClick();
				 
				  
                   //Create a pattern class for create account field and performing double click by using doubleClick method
				   
				   //Pattern nextButton = new Pattern("NextButton.PNG");
				 
				   //s.wait(nextButton,3000);
				   
				   //s.find(nextButton);
}
}

