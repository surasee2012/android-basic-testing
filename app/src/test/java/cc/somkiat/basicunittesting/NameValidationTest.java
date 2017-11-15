package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.NameIsEmptyRule;
import cc.somkiat.basicunittesting.rule.NameOnlyEnglishRule;
import cc.somkiat.basicunittesting.validation.NameValidation;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Gun on 11/15/2017.
 */

public class NameValidationTest {

    @Test(expected = NameIsEmptyRule.class)
    public void emptyName() throws Exception {
        String name = "";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.nameIsEmpty();
    }

    @Test(expected = NameOnlyEnglishRule.class)
    public void numberInName() throws Exception {
        String name = "gun1230";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.nameOnlyEnglish();
    }

    @Test(expected = NameOnlyEnglishRule.class)
    public void spaceName() throws Exception {
        String name = " ";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.nameOnlyEnglish();
    }

    @Test(expected = NameOnlyEnglishRule.class)
    public void symbolName() throws Exception {
        String name = "!@#$%^&*()_+";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.nameOnlyEnglish();
    }

    @Test(expected = NameOnlyEnglishRule.class)
    public void ThaiName() throws Exception {
        String name = "สุรสีห์";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        nameValidation.nameOnlyEnglish();
    }

    @Test
    public void notEmptyName() throws Exception {
        String name = "Naruto1234";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        assertTrue("`true` when Name is not empty", nameValidation.nameIsEmpty());
    }

    @Test
    public void EnglishName() throws Exception {
        String name = "Sasuke";
        UserInfo userInfo = new UserInfo(name);
        NameValidation nameValidation = new NameValidation(userInfo);
        assertTrue("`true` when Name is only English", nameValidation.nameOnlyEnglish());
    }
}
