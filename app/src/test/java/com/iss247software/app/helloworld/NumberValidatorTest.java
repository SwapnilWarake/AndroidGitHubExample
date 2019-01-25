package com.iss247software.app.helloworld;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class NumberValidatorTest {

    NumberValidator SUT; // SUT = System Under Test

    @Before
    public void setup() {
        SUT = new NumberValidator();
    }

    @Test
    public void testEvenNumber() {
        boolean result = SUT.isEvenNumber(30);
        Assert.assertThat(result, is(true));
    }
}