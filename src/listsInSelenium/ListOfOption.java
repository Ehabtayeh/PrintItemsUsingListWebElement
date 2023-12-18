package listsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListOfOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ehab Alking\\Desktop\\WebDriver Files\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();

		// bring the project title
		String title = driver.getTitle();
		System.out.println("The title is : " + " " + title);

		// print to one element from List
		String mYOption = driver.findElement(By.tagName("option")).getText();
		System.out.println("The first item is : " + " " + mYOption);

		// print to size of list
		List<WebElement> myListOption = driver.findElements(By.tagName("option"));
		System.out.println("The number of items in lis = " + " " + myListOption.size());

		// print all inside list
		List<WebElement> myListOption2 = driver.findElements(By.tagName("option"));
		System.out.println("My List :");
		for (int i = 0; i < myListOption2.size(); i++) {

			System.out.println(myListOption2.get(i).getText());

		}
		driver.quit();

	}

}
