package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatPredatorTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected  = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected ,feline.eatMeat());
    }

    @Test
    public void eatMeatHerbivorousTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected  = List.of("Трава", "Различные растения");
        Assert.assertEquals(expected ,feline.getFood("Травоядное"));
    }

    @Test(expected = Exception.class)
    public void eatMeatUnknownTest() throws Exception {
        Feline feline = new Feline();
        feline.getFood("Чудо-юдо");
    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }
}
