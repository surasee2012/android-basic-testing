package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.EmailIsEmptyRule;
import cc.somkiat.basicunittesting.rule.EmailPatternRule;
import cc.somkiat.basicunittesting.validation.EmailValidation;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Gun on 11/15/2017.
 */

public class EmailValidationTest {

    @Test(expected = EmailIsEmptyRule.class)
    public void EmptyEmail() throws Exception {
        String email = "";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.emailIsEmpty();
    }

    @Test
    public void notEmptyEmail() throws Exception {
        String email = "asdfasdfasdf";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when enail is not empty", emailValidation.emailIsEmpty());
    }

    @Test(expected = EmailPatternRule.class)
    public void withOutAtSignEmail() throws Exception {
        String email = "meow_meowhotmail.com";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.isEmailPattern();
    }

    @Test(expected = EmailPatternRule.class)
    public void withOutTopDomainEmail() throws Exception {
        String email = "@hotmail.com";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.isEmailPattern();
    }

    @Test(expected = EmailPatternRule.class)
    public void withOutDotEmail() throws Exception {
        String email = "meow_meow@hotmailcom";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        emailValidation.isEmailPattern();
    }

    @Test
    public void correctPatternEmail() throws Exception {
        String email = "asdfasf@gmail.asdf";
        UserInfo userInfo = new UserInfo("" , email);
        EmailValidation emailValidation = new EmailValidation(userInfo);
        assertTrue("`true` when it's email pattern", emailValidation.isEmailPattern());
    }
}
