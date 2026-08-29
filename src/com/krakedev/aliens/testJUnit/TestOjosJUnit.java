package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestOjosJUnit {

    @Test
    public void testAlienPequenio() {

        Alien alien = new Alien(8, "Verde");

        boolean resultado = alien.agregarOjos(3);

        assertTrue(resultado);
        assertEquals(3, alien.getNumeroOjos());
    }

    @Test
    public void testAlienPequenioExcedeOjos() {

        Alien alien = new Alien(8, "Verde");

        boolean resultado = alien.agregarOjos(4);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroOjos());
    }

    @Test
    public void testAlienMediano() {

        Alien alien = new Alien(15, "Azul");

        boolean resultado = alien.agregarOjos(5);

        assertTrue(resultado);
        assertEquals(5, alien.getNumeroOjos());
    }

    @Test
    public void testAlienGrande() {

        Alien alien = new Alien(25, "Rojo");

        boolean resultado = alien.agregarOjos(7);

        assertTrue(resultado);
        assertEquals(7, alien.getNumeroOjos());
    }
}