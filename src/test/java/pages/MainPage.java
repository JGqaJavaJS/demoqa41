package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {

    By textElements = By.xpath("//h5[text()='Elements']");
    String elements = "Elements";

//    public String getTextElements() {
//        return getTextBase(textElements);
//    }


    public boolean validateTextElementsCorrect() {
        return isTextEqual(textElements, elements);
    }

    public void openElementsPage() {
        clickBase(textElements);
    }
}
