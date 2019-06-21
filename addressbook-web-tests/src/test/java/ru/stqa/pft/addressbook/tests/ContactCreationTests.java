package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;

public class ContactCreationTests extends TestBase {

  @Test

  public void testContactCreation() {
    app.goTo().gotoHomePage("home");
    app.getContactHelper().initContactCreation();
    File photo = new File("src/test/resources/stru.png");
    app.getContactHelper().fillContactForm(
            new ContactData().withFirstname("test_name").withLastname("test_surname").withPhoto(photo), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }

}
