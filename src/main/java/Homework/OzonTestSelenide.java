package Homework;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import javax.security.auth.login.Configuration;

import java.util.Iterator;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OzonTestSelenide {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Code\\chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.timeout = 6000;
        ElementsWeb e = new ElementsWeb();
        open(e.URL);
        Thread.sleep(1000);

        e.Catalog.click();
        e.Books.hover();
        e.IT.click();
        e.BestSellers.click();
        e.Languages.click();
        Random rnd = new Random();
        int NumberOFBook = rnd.nextInt(e.RandomBook().size());
        System.out.println("Кол-во книг: " + e.RandomBook().size());
        e.RandomBook().get(NumberOFBook).click();

        e.AddToCart.click();
        Thread.sleep(1000);
        e.Cart.click();
        String s1 = e.BeforeCart.text();
        String s2;
        Thread.sleep(3000);

        try {
            s2=e.AfterCart.text();
            if (s1.equals(s2))
                System.out.println("It is all good!");

        } catch (Exception f) {
            System.out.println("Something wrong!");
        }
        Thread.sleep(3000);
    }
}
