import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class authDone {
   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1440x812";
   }

   @Test
   void auth() {
      open("https://stand-qa-03-my.b2broker.tech/");
      $("#mat-input-0").setValue("dgrebenyuk+met@b2broker.com");
      $("#mat-input-1").setValue("123456As");
      $(".ng-star-inserted > .mat-focus-indicator.mat-flat-button.mat-button-base.mat-accent").click();
      $(byText("Dashboard")).shouldHave(text("Dashboard"));

   }

   @Test
   void authNot() {
      open("https://stand-qa-03-my.b2broker.tech/");
      $("#mat-input-0").setValue("dgrebenyuk+met@b2broker.com");
      $("#mat-input-1").setValue("123456As");
      $(".ng-star-inserted > .mat-focus-indicator.mat-flat-button.mat-button-base.mat-accent").click();
      $(byText("Wallet")).shouldHave(text("Wallet"));

   }

}
