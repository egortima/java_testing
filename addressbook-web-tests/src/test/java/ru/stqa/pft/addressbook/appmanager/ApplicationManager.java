package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {

  protected WebDriver driver;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() {

    if (browser.equals(BrowserType.FIREFOX)) {

      driver = new FirefoxDriver();

    } else if (browser.equals(BrowserType.GOOGLECHROME)) {

      driver = new ChromeDriver();

    } else if (browser.equals(BrowserType.IE)) {

      driver = new InternetExplorerDriver();
      driver.manage().window().maximize();

    } else if (browser.equals(BrowserType.EDGE)) {

      driver = new EdgeDriver();

    } else if (browser.equals(BrowserType.OPERA_BLINK)) {

      OperaOptions options = new OperaOptions();
      options.setBinary("C:\\Program Files\\60.0.3255.84\\opera.exe");
      System.setProperty("webdriver.opera.driver", "C:\\Tools\\operadriver.exe");
      driver = new OperaDriver(options);

    }

    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    driver.get("http://addressbook/");

    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    contactHelper = new ContactHelper(driver);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    driver.quit();
    String verificationErrorString = groupHelper.verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public GroupHelper group() {
    return groupHelper;
  }

  public NavigationHelper goTo() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
