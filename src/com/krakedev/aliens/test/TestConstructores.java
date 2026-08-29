package com.krakedev.aliens.test;

import com.krakedev.aliens.Alien;

public class TestConstructores {

    public static void main(String[] args) {

        Alien alien1 = new Alien(20, "Verde");

        System.out.println("----- ALIEN 1 -----");
        alien1.imprimir();

        System.out.println();

        Alien alien2 = new Alien(40, "Azul");

        System.out.println("----- ALIEN 2 -----");
        alien2.imprimir();

        System.out.println();

        Alien alien3 = new Alien(2, "Rojo");

        System.out.println("----- ALIEN 3 -----");
        alien3.imprimir();
    }
}