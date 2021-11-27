package yarieva;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestSelenideGithub {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";

        Configuration.baseUrl = "https://github.com";
    }

    // - Откройте страницу Selenide в Github
    @Test
    void searchPageWithJUnit5() {
        open("/selenide/selenide");

        //  Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));

        //- Откройте страницу SoftAssertions,
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();

        //проверьте что внутри есть пример кода для JUnit5
        $("#repo-content-pjax-container").shouldHave(text("Using JUnit5 extend test class:"));

        sleep(1000);

    }


}
