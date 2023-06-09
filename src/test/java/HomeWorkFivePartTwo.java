import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkFivePartTwo {

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1440x812";
   }

   @Test
   void dragDrop() {
      open("https://the-internet.herokuapp.com/drag_and_drop");
      actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).perform();
      $("#column-b").shouldHave(text("A"));
      $("#column-a").shouldHave(text("B"));
   }

   @Test
   void dragDropTo() {
      open("https://the-internet.herokuapp.com/drag_and_drop");
      $("#column-a").dragAndDropTo($("#column-b"));
      $("#column-b").shouldHave(text("A"));
      $("#column-a").shouldHave(text("B"));
   }
}
