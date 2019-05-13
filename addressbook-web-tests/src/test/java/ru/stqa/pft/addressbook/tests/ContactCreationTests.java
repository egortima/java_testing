package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactCreationTests extends TestBase {

  @Test

  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage("home");
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactDate("test_name","test_surname"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}
