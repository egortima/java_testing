package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.util.List;

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

  private Groups groupCache = null;

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

  public void selectGroupById(int id) {
    driver.findElement(By.cssSelector("input[value='"+ id +"']")).click();
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void create(GroupData group) {
    initGroupCreation("new");
    fillGroupForm(group);
    submitGroupCreation("submit");
    groupCache = null;
    returnToGroupPage("group page");
  }

  public void modify(GroupData group) {
    selectGroupById(group.getId());
    initGroupModification();
    fillGroupForm(group);
    submitGroupModification();
    groupCache = null;
    returnToGroupPage("group page");
  }

  public void delete(GroupData group) {
    selectGroupById(group.getId());
    deleteSelectedGroups("delete");
    groupCache = null;
    returnToGroupPage("group page");
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));

  }

  public int count() {
    return driver.findElements(By.name("selected[]")).size();
  }

  public Groups all() {
    if(groupCache != null){
      return new Groups(groupCache);
    }

    groupCache = new Groups();
    List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
    for (WebElement element : elements) {
      String name = element.getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      groupCache.add(new GroupData().withId(id).withName(name));
    }
    return new Groups(groupCache);
  }
}
