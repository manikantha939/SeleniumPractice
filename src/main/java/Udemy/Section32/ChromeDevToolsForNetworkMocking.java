package Udemy.Section32;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.fetch.Fetch;

import java.util.Optional;

public class ChromeDevToolsForNetworkMocking {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));

        devTools.addListener(Fetch.requestPaused(), request -> {
            if (request.getRequest().getUrl().contains("shetty")) {
                String mockedURL = request.getRequest().getUrl().replace("=shetty", "=BadGuy");
                System.out.println(mockedURL);

                devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(mockedURL), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
            } else {
                devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
            }
        });

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.cssSelector("button[routerLink*='library']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p")).getText());

    }
}
