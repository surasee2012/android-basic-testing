package cc.somkiat.basicunittesting.rule;

import cc.somkiat.basicunittesting.model.UserInfo;

/**
 * Created by Gun on 11/15/2017.
 */

public class NameIsEmptyRule extends Exception implements Rule{

    public NameIsEmptyRule() {
    }

    public NameIsEmptyRule(String s) {
        super(s);
    }

    @Override
    public boolean validate(UserInfo user) throws Exception{
        if (user.getName().isEmpty()) {
            throw new NameIsEmptyRule("Name is empty");
        }
        return true;
    }
}
