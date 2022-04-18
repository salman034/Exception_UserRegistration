package com.bl.exception;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenEmailWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.email();
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
