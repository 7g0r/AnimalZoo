package com.igorchmielewski;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeddyBearTest {

    @Test
    void shouldDontEat() throws IDontEatExeption {
        Animal animal = new TeddyBear("Teddy Bear");



        assertThrows(IDontEatExeption.class,() -> animal.eat());
    }
}