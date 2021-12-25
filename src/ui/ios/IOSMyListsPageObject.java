package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.MyListsPageObject;

public class IOSMyListsPageObject extends MyListsPageObject {
    static {
        ARTICLE_BY_TITLE_TPL ="xpath://XCUIElementTypeLink[contains(@name='{TITLE}')]";
        SEARCH_RESULT_ELEMENTS_IN_MY_LIST = "id:???"; /*should know */
        //FOLDER_BY_ID_TPL = "id:org.wikipedia:id/item_title";
    }
    public IOSMyListsPageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
