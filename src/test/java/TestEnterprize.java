import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestEnterprize {
    @BeforeAll
            static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 5000;
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void openEnterprize(){
        open("https://github.com");
        //$(byText("Solutions")).hover().$(byText("Entrepfise")).click();
        $(byText("Solutions")).hover();
        $$("div.HeaderMenu-dropdown div").get(1).$("a");
        //$("div. ul li a").sibling(1).click();
        //$("div. ul li a").click();
    }
}
