import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class homeWorkFivePartTwo {

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1440x812";
   }

   @Test
   void dragDrop() {
      open("https://the-internet.herokuapp.com/drag_and_drop");
      actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(250, 0).release().perform();
      actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).perform();
      $("#column-b").shouldHave(text("A"));
      sleep(5000);
   }
}
