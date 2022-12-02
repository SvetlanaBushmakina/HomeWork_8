package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AddRemoveElements {
    private final static SelenideElement buttonAddElement = $(byText("Add Element"));
    public static ElementsCollection buttonDelete = $$x("//button[@class='added-manually']");

    public static void clickAddElement(Integer count) {
        for (int i = 0; i < count; i++) {
            buttonAddElement.click();
        }
    }
}
