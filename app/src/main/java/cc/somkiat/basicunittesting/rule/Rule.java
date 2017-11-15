package cc.somkiat.basicunittesting.rule;

import cc.somkiat.basicunittesting.model.UserInfo;

/**
 * Created by Gun on 11/15/2017.
 */

public interface Rule {
    boolean validate(UserInfo user) throws Exception;
}
