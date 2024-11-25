import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.net.URL;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта Appleinsider.ru
 */

public class MainPage {
    private final SelenideElement textBootInput = $x("//input [@type = 'text']");

    public MainPage(String url){
        Selenide.open(url);
    }


    /**
     * Выполняется поиск на сайте среди статей и нажимается кнопка enter
     * @param searchString это поисковая строка
     */

    public SearchPage search (String searchString){
        textBootInput.setValue(searchString);
        textBootInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
    
}
