package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorTests {
    @Test
    public void constructorTest(){
        Dog dog = new Dog("Lucky");
        assertEquals("Lucky",dog.getName());
    }
    @Test
    public void constructorNameColorTest(){
        Dog dog = new Dog("Mary","Black");
        assertEquals("Mary",dog.getName());
        assertEquals("Black",dog.getColor());
    }
    @Test
    public void constructorNameColorOldTest(){
        Dog dog = new Dog("Ton", "White",5);
        assertEquals("Ton",dog.getName());
        assertEquals("White",dog.getColor());
        assertEquals(5,dog.getOld());
    }
}
