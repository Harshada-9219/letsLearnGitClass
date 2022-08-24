package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NTHomePage {
	WebDriver driver;

	public By userName = By.name("username");
	public By password = By.name("password");
	public By submitButton = By.xpath("//form[@name='loginform']/button");
	String url = "https://nichethyself.com/tourism/home.html";

	public NTHomePage() {
		System.out.println("i modified");
		System.out.println("patil modified the file");
		System.out.println("i added one file to qa1");
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91820\\eclipse-workspace\\webdrivertraining\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void login(String user, String pass) {
		driver.findElement(userName).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submitButton).click();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void tearDown() {
		driver.quit();
	}
public void alertaccept() {
	Alert ac = driver.switchTo().alert();
	ac.accept();
}
}
