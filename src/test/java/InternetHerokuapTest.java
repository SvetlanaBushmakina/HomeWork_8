import org.junit.Test;
import testSteps.TestSteps;

public class InternetHerokuapTest extends BaseTest {

    private final static String baseUrl = "https://the-internet.herokuapp.com/";

    @Test
    public void checkboxes() {
        TestSteps.openMainPage(baseUrl);
        TestSteps.clickTextOnMainPage("Checkboxes");
        TestSteps.setCheckbox1();
    }

    @Test
    public void formAuthentication() {
        TestSteps.openMainPage(baseUrl);
        TestSteps.clickTextOnMainPage("Form Authentication");
        TestSteps.enterTheUsernameAndPassword("tomsmith", "SuperSecretPassword!");
        TestSteps.checkTextSuccessfulАuthorization();
    }

    @Test
    public void formAuthenticationInvalid() {
        TestSteps.openMainPage(baseUrl);
        TestSteps.clickTextOnMainPage("Form Authentication");
        TestSteps.enterTheUsernameAndPasswordInvalid("tomsmth", "SuperSecretPassword!");
        TestSteps.checkTextUnSuccessfulАuthorization();
    }

    @Test
    public void hover() {
        TestSteps.openMainPage(baseUrl);
        TestSteps.clickTextOnMainPage("Hovers");
        TestSteps.pointingToAnElement(1);
    }

    @Test
    public void dynamicallyLoaded() {
        TestSteps.openMainPage(baseUrl);
        TestSteps.clickTextOnMainPage("Dynamic Loading");
        TestSteps.loaded();
    }

    @Test
    public void keyPresses() {
        TestSteps.openMainPage(baseUrl);
        TestSteps.clickTextOnMainPage("Key Presses");
        TestSteps.keyPresses("a");
    }

    @Test
    public void addRemoveElements() {
        TestSteps.openMainPage(baseUrl);
        TestSteps.clickTextOnMainPage("Add/Remove Elements");
        TestSteps.addRemoveElements(3);
    }
}
