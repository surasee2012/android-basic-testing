package cc.somkiat.basicunittesting;

import android.provider.ContactsContract;

import org.junit.Test;

import java.util.Date;

import cc.somkiat.basicunittesting.model.UserInfo;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gun on 11/15/2017.
 */

public class UserInfoTest {

    @Test
    public void UserInfoTestGetSetName() throws Exception {
        String name = "Gun";
        UserInfo userInfo = new UserInfo(name);
        assertEquals("Gun", userInfo.getName());
        userInfo.setName("Surasee");
        assertEquals("Surasee", userInfo.getName());
    }

    @Test
    public void UserInfoTestGetSetNameDate() throws Exception {
        String name = "Surasee";
        Date birthday = new Date(1996, 12, 12);
        UserInfo userInfo = new UserInfo(name, birthday);
        assertEquals("Surasee", userInfo.getName());
        assertEquals(birthday.toString(), userInfo.getBirthday().toString());
        userInfo.setName("SuraseeSai");
        birthday = new Date(2017, 11, 15);
        userInfo.setBirthday(birthday);
        assertEquals("SuraseeSai", userInfo.getName());
        assertEquals(birthday.toString(), userInfo.getBirthday().toString());
    }

    @Test
    public void UserInfoTestGetSetNameDateEmail() throws Exception {
        String name = "gungun";
        Date birthday = new Date(1996, 12, 12);
        String email = "surasee@gmail.com";
        UserInfo userInfo = new UserInfo(name, birthday, email);
        assertEquals("gungun", userInfo.getName());
        assertEquals(birthday.toString(), userInfo.getBirthday().toString());
        assertEquals("surasee@gmail.com", userInfo.getEmail());
        userInfo.setName("SuraseeSai");
        birthday = new Date(2011, 1, 1);
        userInfo.setBirthday(birthday);
        userInfo.setEmail("suragun@hotmail.com");
        assertEquals("SuraseeSai", userInfo.getName());
        assertEquals(birthday.toString(), userInfo.getBirthday().toString());
        assertEquals("suragun@hotmail.com", userInfo.getEmail());
    }
}
