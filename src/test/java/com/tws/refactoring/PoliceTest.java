package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {

    private static Police police;

    @BeforeAll
    public static void init() {
        police = new Police();
    }

    @Test
    public void should_return_true_when_driver_age_over_18() {
        Driver driver = new Driver(19);
        Assertions.assertSame(true, police.checkDriver(driver));
    }

    @Test
    public void should_false_true_when_driver_age_below_18() {
        Driver driver = new Driver(15);
        Assertions.assertSame(false, police.checkDriver(driver));
    }

    @Test
    public void should_false_true_when_driver_age_equal_18() {
        Driver driver = new Driver(18);
        Assertions.assertSame(true, police.checkDriver(driver));
    }

}