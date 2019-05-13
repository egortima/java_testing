package ru.stqa.pft.addressbook.model;

public class ContactDate {
    private final String firstname;
    private final String lastname;
    private String group;

  public ContactDate(String firstname, String lastname, String group) {
      this.firstname = firstname;
      this.lastname = lastname;
    this.group = group;
  }

    public String getFirstname() {
      return firstname;
    }

    public String getLastname() {
      return lastname;
    }


  public String getGroup() {
    return group;
  }
}
