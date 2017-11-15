package cc.somkiat.basicunittesting.rule;

import cc.somkiat.basicunittesting.model.UserInfo;

/**
 * Created by Gun on 11/15/2017.
 */

public class EmailIsEmptyRule extends Exception implements Rule{

    public EmailIsEmptyRule() {
    }

    public EmailIsEmptyRule(String s) {
        super(s);
    }

    @Override
    public boolean validate(UserInfo user) throws Exception {
        if (user.getEmail().isEmpty()) {
            throw new EmailIsEmptyRule("Email is empty");
        }
        return true;
    }
}
