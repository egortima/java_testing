package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactHelper extends HelperBase {
  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void initContactCreation(){
    click(By.linkText("add new"));
  }

  public void submitContactCreation(){
    click(By.name("submit"));
  }

  public void initContactModification(){
    click(By.cssSelector("#maintable > tbody > tr:nth-child(2) > td:nth-child(8) > a > img"));
  }

  public void submitContactModification(){
    click(By.name("update"));
  }

  public void fillContactForm(ContactDate contactDate, boolean creation) {
    type(By.name("firstname"), contactDate.getFirstname());
    type(By.name("lastname"), contactDate.getLastname());

    if(creation){
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactDate.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void returnToHomePage(){
    click(By.linkText("home page"));
  }
}
