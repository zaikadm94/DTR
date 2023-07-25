package accountingPart;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class accountingPartTest {



    @BeforeEach

    void setUp() {
        open("https://terra.dtechs.io/login");
        $("#db-delete")
        $("[data-testid='username']").setValue("adm2");
        $("[data-testid='password']").setValue("adm2");
        $("[data-testid='login-submit-btn']").click();

    }

    @Test
    public void test() {
        $("main-map").shouldBe(visible);

    }
}
