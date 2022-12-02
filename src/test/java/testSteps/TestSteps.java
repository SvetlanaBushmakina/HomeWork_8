package testSteps;

import com.codeborne.selenide.Condition;
import page.*;

import java.time.Duration;

public class TestSteps {

    public static void openMainPage(String url) {
        MainPage.openWebSite(url);
        System.out.println("Открываем веб сайт: " + url);
    }

    public static void clickTextOnMainPage(String text) {
        MainPage.clickTextOnMainPage(text);
        System.out.println("Нажимаем на " + text);
    }

    public static void setCheckbox1() {
        CheckboxesPage.setCheckbox1();
        System.out.println("Ставим галочку на чекбокс 1");
        CheckboxesPage.checkbox1.shouldBe(Condition.selected);
        System.out.println("Чекбокс 1 нажат");
    }

    public static void enterTheUsernameAndPassword(String login, String pass) {
        FormAuthenticationPage.enterUsernameAndPassword(login, pass);
        System.out.println("Вводим логин и пароль и нажимаем Login ");
    }

    public static void enterTheUsernameAndPasswordInvalid(String login, String pass) {
        FormAuthenticationPage.enterUsernameAndPassword(login, pass);
        System.out.println("Вводим неверные логин и пароль и нажимаем Login ");
    }

    public static void checkTextSuccessfulАuthorization() {
        FormAuthenticationPage.successfulАuthorization.shouldBe(Condition.visible);
        System.out.println("Логин и пароль введены верно");
    }

    public static void checkTextUnSuccessfulАuthorization() {
        FormAuthenticationPage.unSuccessfulАuthorization.shouldBe(Condition.visible);
        System.out.println("Логин и пароль введены неверно");
    }

    public static void pointingToAnElement(Integer index) {
        HoverPage.pointingToAnElement(index);
        System.out.println("Выбран элемент");
        HoverPage.text.shouldBe(Condition.visible);
        System.out.println("Текст элемента виден");
    }

    public static void loaded() {
        DynamicallyLoadedPage.clickExample2();
        System.out.println("Нажимаем на Example 2");
        DynamicallyLoadedPage.start();
        System.out.println("Нажимаем на кнопку Start");
        DynamicallyLoadedPage.textAfterLoading.shouldBe(Condition.visible, Duration.ofSeconds(10));
        System.out.println("Отображается текст Hello World!");
    }

    public static void keyPresses(String text) {
        KeyPressesPage.setTextOnInput(text);
        System.out.println("Вводим текст в поле ввода");
        KeyPressesPage.checkedText.shouldBe(Condition.visible);
        System.out.println("You entered: " + text.toUpperCase());
    }

    public static void addRemoveElements(Integer count) {
        AddRemoveElements.clickAddElement(count);
        System.out.println("Нажали на кнопку Add Element");
        for (int i = 0; i < AddRemoveElements.buttonDelete.size(); i++) {
            AddRemoveElements.buttonDelete.get(i).shouldBe(Condition.visible);
        }
        System.out.println("Delete отображается " + count + " раз");
    }
}
