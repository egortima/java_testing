package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  public StringBuffer verificationErrors = new StringBuffer();
  protected boolean acceptNextAlert = true;

  public GroupHelper(WebDriver driver) {
    super(driver);
  }

  public void returnToGroupPage(String s) {
    click(By.linkText(s));
  }

  public void submitGroupCreation(String submit) {
    click(By.name(submit));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation(String s) {
    click(By.name(s));
  }

  public void deleteSelectedGroups(String delete) {
    click(By.name(delete));
  }

  public void selectGroup(int index) {
    driver.findElements(By.name("selected[]")).get(index).click();
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void createGroup(GroupData group) {
    initGroupCreation("new");
    fillGroupForm(group);
    submitGroupCreation("submit");
    returnToGroupPage("group page");
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));

  }

  public int getGroupCount() {
    return driver.findElements(By.name("selected[]")).size();
  }
}
