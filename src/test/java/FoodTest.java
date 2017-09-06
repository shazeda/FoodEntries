import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shazeda on 9/4/17.
 */
public class FoodTest extends CommonScript {

    @Test
    public void thirdAndFithItem() {

        WebElement thirdItem = foodPage.itemTitles.get(2);
        System.out.println(thirdItem.getText());

        WebElement fifthItem = foodPage.itemTitles.get(4);
        System.out.println(fifthItem.getText());
    }

    @Test
    public void nameAndServings() {

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < foodPage.itemTitles.size(); i++) {

            WebElement titleElement = foodPage.itemTitles.get(i);
            String name = titleElement.getText();

            WebElement descriptionElement = foodPage.itemDescriptions.get(i);
            String serving = descriptionElement.getText();

            map.put(name, serving);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

}
