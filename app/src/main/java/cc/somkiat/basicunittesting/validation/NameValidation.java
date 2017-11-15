package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.model.UserInfo;
import cc.somkiat.basicunittesting.rule.NameOnlyEnglishRule;
import cc.somkiat.basicunittesting.rule.NameIsEmptyRule;

/**
 * Created by Gun on 11/15/2017.
 */

public class NameValidation {

    UserInfo userInfo;

    public NameValidation(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public boolean nameIsEmpty() throws Exception{
        NameIsEmptyRule nameIsEmptyRule = new NameIsEmptyRule();
        return nameIsEmptyRule.validate(userInfo);
    }

    public boolean nameOnlyEnglish() throws Exception{
        NameOnlyEnglishRule nameOnlyEnglishRule = new NameOnlyEnglishRule();
        return nameOnlyEnglishRule.validate(userInfo);
    }

    public boolean validation() throws Exception{
        nameIsEmpty();
        nameOnlyEnglish();
        return true;
    }
}
