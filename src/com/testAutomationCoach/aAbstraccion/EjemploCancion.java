package com.testAutomationCoach.aAbstraccion;

public class EjemploCancion {
    public static void main(String[] args) {
        Cancion help = new Cancion("Help", "The Beatles");
        help.grabar("Help, I need someone", 180, 1960);
        help.reproducir();

        //Constructor
        Cancion hello = new Cancion("hello", "Adelle");
        hello.grabar("Is it me you", 430, 2007);
        hello.reproducir();
    }
}
