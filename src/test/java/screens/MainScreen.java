package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class MainScreen {

    private final SelenideElement searchField = $(accessibilityId("Search Wikipedia"));

    @Step("Кликнуть по строке поиска")
    public void openSearchScreen() {
        searchField.click();
    }
}
