package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreateTests extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("123", "asd", "qwe"));
    submitGroupForm();
    returnToGroupPage();
    logout();
  }

}
