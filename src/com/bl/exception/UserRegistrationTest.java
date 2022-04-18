package com.bl.exception;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPasswordShouldReturnTrueWhenSpecialCharacterHaveTakeAnyOne() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.emailTest("abc+100@gmail.com");
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
