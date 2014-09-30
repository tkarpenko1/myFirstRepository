package com.dataart.selenium.pages;

import com.dataart.selenium.framework.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tkarpenko on 09.09.2014.
 */

public class RegistrationPage extends BasePage {

    private String username = "tk", fname = "t", lname = "k", password = "1", confirm = password;
    private String devname = "dfndln", devfname = "dfn", devlname = "dln", devpassword = "dev", devconfirm = devpassword;

    @FindBy(xpath = REGISTRATION_LINK_XPATH)
    WebElement registrationLink;
    @FindBy (xpath = REGISTRATION_NAME_FIELD_XPATH)
    WebElement registrationNameField;
    @FindBy (xpath = REGISTRATION_FNAME_FIELD_XPATH)
    WebElement registrationFnameField;
    @FindBy (xpath = REGISTRATION_LNAME_FIELD_XPATH)
    WebElement registrationLnameField;
    @FindBy (xpath = REGISTRATION_PASSWORD_FIELD_XPATH)
    WebElement registrationPasswordField;
    @FindBy (xpath = REGISTRATION_CONFIRM_FIELD_XPATH)
    WebElement registrationConfirmField;
    @FindBy (xpath = REGISTRATION_ROLE_SELECT_XPATH)
    WebElement registrationRoleSelect;
    @FindBy (xpath = REGISTRATION_BUTTON_XPATH)
    WebElement registrationButton;
    @FindBy (xpath = REGISTRATION_ROLE_USER_XPATH)
    WebElement registrationRoleUser;
    @FindBy (xpath = REGISTRATION_ROLE_DEVELOPER_XPATH)
    WebElement registrationRoleDeveloper;
    @FindBy (xpath = REGISTRATION_LOGOUT_XPATH)
    WebElement registrationLogout;
    @FindBy (xpath = REGISTRATION_ADD_APPLICATION_XPATH)
    WebElement registrationAddAplication;
    @FindBy (xpath = REGISTRATION_ADD_NEW_APPLICATION_XPATH)
    WebElement registrationAddNewApplication;

    public void clearField() {
        registrationLink.click();
        registrationNameField.clear();
        registrationFnameField.clear();
        registrationLnameField.clear();
        registrationPasswordField.clear();
        registrationConfirmField.clear();
    }

    public void roleSelectClick() {
        registrationRoleSelect.click();
    }

    public void registrationButtonClick() {
        registrationButton.click();
    }

    public void registrationAsUser() {
        clearField();
        registrationNameField.sendKeys(username);
        registrationFnameField.sendKeys(fname);
        registrationLnameField.sendKeys(lname);
        registrationPasswordField.sendKeys(password);
        registrationConfirmField.sendKeys(confirm);
        roleSelectClick();
        registrationRoleUser.click();
        registrationButtonClick();
    }

    public void registrationLogout() {
        registrationLogout.click();
    }

    public void registrationAsDeveloper() {
        clearField();
        registrationNameField.sendKeys(devname);
        registrationFnameField.sendKeys(devfname);
        registrationLnameField.sendKeys(devlname);
        registrationPasswordField.sendKeys(devpassword);
        registrationConfirmField.sendKeys(devconfirm);
        roleSelectClick();
        registrationRoleDeveloper.click();
        registrationButtonClick();
    }

    public void registrationAddApplication() {
        registrationAddAplication.click();
        registrationAddNewApplication.click();
    }

    public static final String REGISTRATION_LINK_XPATH = "//div[@class='form']/a";
    public static final String REGISTRATION_NAME_FIELD_XPATH = "//tr[1]/td[2]/input";
    public static final String REGISTRATION_FNAME_FIELD_XPATH = "//tr[2]/td[2]/input";
    public static final String REGISTRATION_LNAME_FIELD_XPATH = "//tr[3]/td[2]/input";
    public static final String REGISTRATION_PASSWORD_FIELD_XPATH = "//tr[4]/td[2]/input";
    public static final String REGISTRATION_CONFIRM_FIELD_XPATH = "//tr[5]/td[2]/input";
    public static final String REGISTRATION_ROLE_SELECT_XPATH = "//tr[6]/td[2]/select";
    public static final String REGISTRATION_BUTTON_XPATH = "//div[1]/form/input";
    public static final String REGISTRATION_ROLE_USER_XPATH = "//option[@value='USER']";
    public static final String REGISTRATION_ROLE_DEVELOPER_XPATH = "//option[@value='DEVELOPER']";
    public static final String REGISTRATION_LOGOUT_XPATH = "//a[.='Logout']";
    public static final String REGISTRATION_ADD_APPLICATION_XPATH = "//a[.='My applications']";
    public static final String REGISTRATION_ADD_NEW_APPLICATION_XPATH = "//a[.='Click to add new application']";

}
