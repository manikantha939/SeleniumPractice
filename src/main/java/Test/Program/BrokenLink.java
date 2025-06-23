package Test.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLink {
    static int brokenLinkCount=0;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link: links) {
			String url = link.getAttribute("href");
			checkBrokenLink(url);
		}
        System.out.println(brokenLinkCount);
        driver.quit();
	}


	public static void checkBrokenLink(String url) {
		try {
			HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode=conn.getResponseCode();

            if (responseCode >= 400) {
                System.out.println("[BROKEN] " + url + " --> Status Code: " + responseCode);
                brokenLinkCount++;
            } else {
                System.out.println("[OK]     " + url + " --> Status Code: " + responseCode);
            }
		}catch (Exception e){
            System.out.println("[ERROR]  " + url + " --> Exception: " + e.getMessage());
		}
	}
}
