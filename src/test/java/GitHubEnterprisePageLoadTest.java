import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubEnterprisePageLoadTest {
    @Test

    public void foundEnterprisePageTests() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";


        open("https://github.com");
        $(".HeaderMenu-nav").$(byText("Solutions")).hover();
        $("a[href=\"https://github.com/enterprise\"]").click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));

    }

}
