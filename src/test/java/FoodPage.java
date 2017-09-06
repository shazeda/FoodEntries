import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by shazeda on 9/4/17.
 */
public class FoodPage {

    @FindAll(@FindBy(css = ".itemContent .title"))
    List<WebElement> itemTitles;

    @FindAll(@FindBy(css = ".itemContent .description"))
    List<WebElement> itemDescriptions;

}
