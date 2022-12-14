package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HoverPage {
    public static SelenideElement text;

    public static void pointingToAnElement(Integer index) {
        $$x("//img[@alt='User Avatar']").get(index).hover();
        Integer user = index + 1;
        text = $(byText("name: user" + user));
    }
}
