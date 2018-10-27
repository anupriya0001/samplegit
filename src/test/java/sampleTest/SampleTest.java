package sampleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
public void loginTest() throws IOException
{
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
	WebDriver wd= new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://www.bing.com/");
	WebElement login = wd.findElement(By.name("q"));
	login.sendKeys("abc");
	login.submit();
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\githubtest\\screenshot\\sample.jpeg"));
}
}
