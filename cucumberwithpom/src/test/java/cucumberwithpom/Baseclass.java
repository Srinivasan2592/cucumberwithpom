package cucumberwithpom;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void launchurl(String data) {
		driver.get(data);
	}

	public static void entertext(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void buttonclick(WebElement element) {

		element.click();

	}

	public static void selectById(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void getOptions(WebElement element) {
		Select s1 = new Select(element);
		List<WebElement> options = s1.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element2 = options.get(i);
			String text = element2.getText();
			System.out.println(text);
		}

	}
}
