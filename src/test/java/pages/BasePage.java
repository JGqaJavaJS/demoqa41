package pages;

import config.ConfigManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebElement findElementBase(By locator) {

        return ConfigManager.getDriver().findElement(locator);
    }

    protected String getTextBase(By locator) {
        return findElementBase(locator).getText().toUpperCase().trim();
    }

    protected void clickBase(By locator) {
        findElementBase(locator).click();
    }

    public boolean isTextEqual(By locator, String expectedResult) {
        expectedResult = expectedResult.toUpperCase().trim();
        String actualResult = getTextBase(locator);
        if(expectedResult.equals(actualResult)) {
            return true;
        } else {
            System.out.println("actual result: " + actualResult
            + " expected result: " + expectedResult);
            return false;
        }
    }

}
