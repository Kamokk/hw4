package yarieva;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestSelenideGithub {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;

        Configuration.baseUrl = "https://github.com";
    }

    // - Откройте страницу Selenide в Github
    @Test
    void searchPageWithJUnit5() {
open("/selenide/selenide");

// - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions


sleep(500);

    }





 //- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
}
