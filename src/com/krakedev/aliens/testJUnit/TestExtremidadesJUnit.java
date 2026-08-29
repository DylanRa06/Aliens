package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestExtremidadesJUnit {

    @Test
    public void testAgregarBrazosCorrectamente() {

        Alien alien = new Alien(20, "Verde");

        boolean resultado = alien.agregarBrazos(4);

        assertTrue(resultado);
        assertEquals(4, alien.getNumeroBrazos());
    }

    @Test
    public void testAgregarPiernasCorrectamente() {

        Alien alien = new Alien(20, "Verde");

        boolean resultado = alien.agregarPiernas(6);

        assertTrue(resultado);
        assertEquals(6, alien.getNumeroPies());
    }

    @Test
    public void testMaximoExtremidades() {

        Alien alien = new Alien(20, "Verde");

        alien.agregarBrazos(6);

        boolean resultado = alien.agregarPiernas(4);

        assertTrue(resultado);

        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(4, alien.getNumeroPies());
    }

    @Test
    public void testExcedeExtremidades() {

        Alien alien = new Alien(20, "Verde");

        alien.agregarBrazos(6);

        boolean resultado = alien.agregarPiernas(5);

        assertFalse(resultado);

        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }
}