package ru.stqa.pft.addressbook.model;

import java.io.File;

public class ContactData {
  private int id;
  private String firstname;
  private String lastname;
  private String group;
  private String homePhone;
  private String mobilePhone;
  private String workPhone;
  private String allPhones;
  private File photo;

  public String getAllPhones() {
    return allPhones;
  }

  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }




  public ContactData(String firstname, String lastname, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.group = group;
  }

  public ContactData() {

  }

  public ContactData withWorkPhone(String workPhone) {
    this.workPhone = workPhone;
    return this;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public ContactData witHomePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public ContactData withMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }



  public String getFirstname() {
    return firstname;
  }

  public ContactData withFirstname(String firstname) {
    this.firstname = firstname;
    return this;
  }


  public String getLastname() {
    return lastname;
  }

  public ContactData withLastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  public String getGroup() {
    return group;
  }

  public int getId() {
    return id;
  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public ContactData withHomePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  public File getPhoto() {
    return photo;
  }

  public ContactData withPhoto(File photo) {
    this.photo = photo;
    return this;
  }

  public ContactData withGroup(String group) {
    this.group = group;
    return this;
  }
}
