package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

  public SessionHelper(WebDriver driver) {
    super(driver);
  }

  public void login(String username, String password) {

    type(By.name("user"), username);
//    driver.findElement(By.name("user")).click();
//    driver.findElement(By.name("user")).clear();
//    driver.findElement(By.name("user")).sendKeys(username);

    type(By.name("pass"), password);
//    driver.findElement(By.name("pass")).click();
//    driver.findElement(By.name("pass")).clear();
//    driver.findElement(By.name("pass")).sendKeys(password);

    click(By.xpath("//*[@id=\"LoginForm\"]/input[3]"));
//    driver.findElement(By.id("LoginForm")).submit();
  }
}
