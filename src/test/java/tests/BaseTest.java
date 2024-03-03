package tests;

import config.ConfigManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.MainPage;

public class BaseTest extends ConfigManager {

    MainPage mainPage = new MainPage();

//    @BeforeSuite
//    public void init() {
//        ConfigManager.setUp("chrome");
//    }
//
//    @AfterSuite
//    public void stop() {
//        ConfigManager.tearDown();
//    }
}
