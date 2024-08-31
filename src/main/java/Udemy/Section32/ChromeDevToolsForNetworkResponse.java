package Udemy.Section32;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v127.network.Network;
import org.openqa.selenium.devtools.v127.network.model.Request;
import org.openqa.selenium.devtools.v127.network.model.Response;

import java.util.HashMap;

public class ChromeDevToolsForNetworkResponse {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\localnode\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

//        devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));

        HashMap<String, Object> h = new HashMap<>();
        h.put("maxTotalBufferSize", 1);
        h.put("maxResourceBufferSize", 1);
        h.put("maxPostDataSize", 1);
        driver.executeCdpCommand("Network.enable", h);

        devTools.addListener(Network.requestWillBeSent(), request -> {
            Request req = request.getRequest();
            System.out.println(req.getHeaders());
        });

        devTools.addListener(Network.responseReceived(), response -> {
            Response res = response.getResponse();
            if (res.getStatus().toString().startsWith("4")) {
                System.out.println(res.getUrl());
                System.out.println(res.getStatus());
            }

        });

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularAppdemo");
        driver.findElement(By.cssSelector("button[routerLink*='library']")).click();

    }
}
