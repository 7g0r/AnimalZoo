package com.igorchmielewski;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class PolarBearTest {
    @Test
    public void shouldBeALiveAfterBorn(){
        //given
        Animal animal = new PolarBear("Koralgol");
        //when
        assertTrue(animal.isAlive());
        //then
    }

    @Test
    void shouldBeALiveAfterEating() throws IDontEatExeption {
        Animal animal = new PolarBear("Koralgol");

        animal.eat();

        assertTrue(animal.isAlive());
    }

    @Test
    void shouldBeDeadIfEat11DaysBefore() {

        Animal animal = spy(new PolarBear("Koralgol"));

        LocalDateTime value = LocalDateTime.now().minusDays(11);
        when(animal.getToday()).thenReturn(value);

        assertFalse(animal.isAlive());
    }
}