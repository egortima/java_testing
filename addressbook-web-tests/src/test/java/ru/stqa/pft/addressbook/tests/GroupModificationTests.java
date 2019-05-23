package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification()
  {
    app.getNavigationHelper().gotoGroupPage("groups");
    int before = app.getGroupHelper().getGroupCount();
    if(! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup("selected[]");
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test2", "Hello!", "Wow"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage("group page");
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before);
  }
}
