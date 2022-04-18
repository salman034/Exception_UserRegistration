package com.bl.exception;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPhoneNumberWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.phoneNumber();
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
