package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestPrecioTotalJUnit {

    @Test
    public void testPrecioTotal() {

        Alien alien = new Alien(20, "Verde");

        alien.agregarBrazos(2);
        alien.agregarPiernas(2);
        alien.agregarOjos(2);

        assertEquals(14.0, alien.getPrecioTotal(), 0.0001);
    }
}