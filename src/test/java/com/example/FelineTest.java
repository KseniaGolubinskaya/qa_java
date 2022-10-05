package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

//@RunWith(Parameterized.class)
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

    @Test
    public void eatMeatUnknownTest() throws Exception {
        Feline feline = new Feline();
//        (feline.getFood("Чудо-юдо")); //todo: throws
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

    @Test
    public void getKittensByNumberTest(){ //todo: param
        Feline feline = new Feline();
        int kittensCount = 3;
        int expected = kittensCount;
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(expected, actual);
    }
}
