package Homework;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ElementsWeb {

    public final String URL = "http://www.ozon.ru";
    public SelenideElement Catalog = $(byText("Каталог"));
    public SelenideElement Books = $(byText("Книги"));
    public SelenideElement IT = $(byText("Компьютерные технологии"));
    public SelenideElement BestSellers = $(byText("Бестселлеры"));
    public SelenideElement Languages = $(byText("Языки программирования"));
    public SelenideElement AddToCart = $(byText("Добавить в корзину"));
    public SelenideElement Cart = $(By.cssSelector("a[href='/cart']"));
    public SelenideElement BeforeCart = $(By.cssSelector("div.top h1"));
    public SelenideElement AfterCart = $(By.cssSelector("a.title span"));

    public ElementsCollection RandomBook() {
        return $$(By.cssSelector("div.tiles >div"));
    }

}
