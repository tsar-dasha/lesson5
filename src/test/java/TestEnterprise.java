import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.ShouldHave;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TestEnterprise {
    @BeforeAll
            static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void openEnterpriseTest(){
        open("https://github.com");
       $(".Header-old").$(byText("Solutions")).hover();
       $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
       $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" + "developer platform."));
    }
}