import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestDragDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void moveRectangle(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(220, 0).release().perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-a").dragAndDrop(DragAndDropOptions.to($("#column-b")));
        $("#column-a").shouldHave(text("A"));
    }
}