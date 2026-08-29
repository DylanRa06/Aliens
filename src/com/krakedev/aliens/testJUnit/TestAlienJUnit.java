package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienJUnit {

    @Test
    public void testAtributos() {

        Alien alien = new Alien(20, "Verde");

        assertEquals(20, alien.getTamanio());
        assertEquals("Verde", alien.getColor());
    }

    @Test
    public void testTamanioMinimo() {

        Alien alien = new Alien(2, "Rojo");

        assertEquals(5, alien.getTamanio());
    }

    @Test
    public void testTamanioMaximo() {

        Alien alien = new Alien(40, "Azul");

        assertEquals(30, alien.getTamanio());
    }

    @Test
    public void testPrecios() {

        Alien alien = new Alien(20, "Verde");

        assertEquals(4.0, alien.getPrecioCuerpo(), 0.0001);
        assertEquals(2.0, alien.getPrecioExtremidad(), 0.0001);
        assertEquals(1.0, alien.getPrecioOjo(), 0.0001);
    }
}