package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {
    public FelineGetKittensTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    int kittensCount;

    @Parameterized.Parameters
    public static Object[] getKittensCount() {
        return new Object[] {
                3,
                5,
        };
    }

    @Test
    public void getKittensByNumberTest(){
        Feline feline = new Feline();
        int expected = kittensCount;
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(expected, actual);
    }
}
