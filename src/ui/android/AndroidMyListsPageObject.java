package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.MyListsPageObject;

public class AndroidMyListsPageObject extends MyListsPageObject {
    static {
        FOLDER_BY_NAME_TPL ="xpath://*[@text = '{FOLDER_NAME}']";
        ARTICLE_BY_TITLE_TPL ="xpath://*[@text='{TITLE}']";
        SEARCH_RESULT_ELEMENTS_IN_MY_LIST = "id:org.wikipedia:id/page_list_item_container";
        //FOLDER_BY_ID_TPL = "id:org.wikipedia:id/item_title";
    }
    public AndroidMyListsPageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
