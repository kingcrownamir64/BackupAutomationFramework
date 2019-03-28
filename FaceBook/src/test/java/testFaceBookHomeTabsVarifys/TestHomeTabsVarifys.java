package testFaceBookHomeTabsVarifys;

import base.CommonAPI;
import facebookHomeTabVarifys.HomeTabsVarifys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomeTabsVarifys extends CommonAPI {

    HomeTabsVarifys homeTabsVarifys;
    String homeUrl = "https://www.facebook.com/";

    @BeforeClass
    public void initialization(){
        driver.get(homeUrl);
        homeTabsVarifys = PageFactory.initElements(driver,HomeTabsVarifys.class);
        homeTabsVarifys.setLogIn();
    }
    @Test
    public void testSetNewsFeed(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setNewsFeed();
    }
    @Test
    public void testSetMessengerTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setMessengerTab();
    }
    @Test
    public void testSetWatchTab()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setWatchTab();
    }
    @Test
    public void testSetWellcomeTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setWellcomeTab();
    }
    @Test
    public void testSetPagesTab()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setPagesTab();
    }
    @Test
    public void testGroupTab()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setGroupTab();
    }
    @Test
    public void testEventsTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setEventsTab();
    }
    @Test
    public void testFriendListTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setFriendList();
    }
    @Test
    public void testGamesTab()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setGamesTab();
    }
    @Test
    public void testFundRisers()throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setFundRisers();
    }
    @Test
    public void testMemoriesTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setMemoriesTab();
    }
    @Test
    public void testFindFriendTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setFindfriendTab();
    }
    @Test
    public void testWeatherTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setWeatherTab();
    }
    @Test
    public void testRecomendationTab() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setRecomendationTab();
    }
    @Test
    public void testMessegerKidsTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setMessengerKidsTab();
    }
    @Test
    public void testTownHallTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setTownHallTab();
    }
    @Test
    public void testGamingVideo(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setGamingVideoTab();
    }
    @Test
    public void testJobTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setJobsTab();
    }
    @Test
    public void testOfferTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setOfferTab();
    }
    @Test
    public void testFilmTab(){
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTabsVarifys.setFilmTab();
    }
}