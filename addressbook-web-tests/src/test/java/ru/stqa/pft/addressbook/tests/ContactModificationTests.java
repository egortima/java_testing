package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage("home");
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactDate("test_name","test_surname"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }

}
