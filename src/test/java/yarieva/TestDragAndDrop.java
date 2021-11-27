package yarieva;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestDragAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";

        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }

    @Test
    void methodDragAndDrop() {
        //Открыть https://the-internet.herokuapp.com/drag_and_drop
        open("/drag_and_drop");

        // Переместить элементы
        $("#column-a").dragAndDropTo($("#column-b"));

        //  Проверить что первый элемент равен B
        $$(".column").get(0).shouldHave(text(("B")));
        sleep(1000);
    }
}
