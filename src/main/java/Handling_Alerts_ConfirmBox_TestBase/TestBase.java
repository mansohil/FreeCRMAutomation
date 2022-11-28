package Handling_Alerts_ConfirmBox_TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Handling_Alerts_ConfirmBox_TestUtilities.WebEventListen;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	static EventFiringWebDriver e_driver;
	WebEventListen eventListner;

	public TestBase() throws IOException {

		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\mdsohil\\eclipse-workspace\\Alert_Handling\\src\\main\\java\\Handling_Alerts_ConfirmBox_Properties\\config.properties");
		prop.load(file);

	}

	public static void initialization() throws IOException {
		if (prop.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (prop.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (prop.getProperty("browser").equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		e_driver = new EventFiringWebDriver(driver);
		WebEventListen eventListner = new WebEventListen();
		e_driver.register(eventListner);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}

}
