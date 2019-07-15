package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoliceTest {

    private static Driver driver;

    @BeforeEach
    public void init() {
        driver = new Driver();
    }

    @Test
    public void should_return_true_when_driver_age_over_18() {
        driver.setAge(19);
        Assertions.assertSame(true, driver.isLegalDriver());
    }

    @Test
    public void should_false_true_when_driver_age_below_18() {
        driver.setAge(15);
        Assertions.assertSame(false, driver.isLegalDriver());
    }

    @Test
    public void should_false_true_when_driver_age_equal_18() {
        driver.setAge(18);
        Assertions.assertSame(true, driver.isLegalDriver());
    }

}