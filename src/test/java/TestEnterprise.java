import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestEnterprise {
    @BeforeAll
            static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 5000;
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void openEnterprise(){
        open("https://github.com");
        $(byText("Solutions")).hover();
        $(byTagAndText("a","Enterprise")).click();
        $("The AI-powered developer platform.").shouldBe(visible);
    }
}
