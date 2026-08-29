package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienIA {

    @Test
    public void testLimiteExactoMinimo() {

        Alien alien = new Alien(5, "Verde");

        assertEquals(5, alien.getTamanio());
    }

    @Test
    public void testLimiteExactoMaximo() {

        Alien alien = new Alien(30, "Rojo");

        assertEquals(30, alien.getTamanio());
    }

    @Test
    public void testDiezExtremidadesExactas() {

        Alien alien = new Alien(20, "Azul");

        assertTrue(alien.agregarBrazos(5));
        assertTrue(alien.agregarPiernas(5));

        assertEquals(5, alien.getNumeroBrazos());
        assertEquals(5, alien.getNumeroPies());
    }

    @Test
    public void testOnceExtremidades() {

        Alien alien = new Alien(20, "Azul");

        alien.agregarBrazos(5);

        boolean resultado = alien.agregarPiernas(6);

        assertFalse(resultado);

        assertEquals(5, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testOjosAcumulados() {

        Alien alien = new Alien(15, "Verde");

        assertTrue(alien.agregarOjos(2));
        assertTrue(alien.agregarOjos(3));

        assertEquals(5, alien.getNumeroOjos());

        assertFalse(alien.agregarOjos(1));

        assertEquals(5, alien.getNumeroOjos());
    }

    @Test
    public void testPrecioSeActualizaAutomaticamente() {

        Alien alien = new Alien(20, "Verde");

        alien.agregarBrazos(2);

        assertEquals(8.0, alien.getPrecioTotal(), 0.0001);

        alien.agregarPiernas(2);

        assertEquals(12.0, alien.getPrecioTotal(), 0.0001);

        alien.agregarOjos(2);

        assertEquals(14.0, alien.getPrecioTotal(), 0.0001);
    }
}