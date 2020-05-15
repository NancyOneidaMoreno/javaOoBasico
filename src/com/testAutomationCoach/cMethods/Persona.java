package com.testAutomationCoach.cMethods;

public class Persona {
    String nombre;
    double estatura;
    double peso;
    int nivelHambre; //0, lleno, 100, tiene mucha hambre,

    public void comer() {
        if(nivelHambre < 20) {
            System.out.println("Come una ensalada");
            peso += 0.005;
        } else if(nivelHambre < 50) {
            System.out.println("Come un sandwich");
            peso += 0.010;
        } else if(nivelHambre < 70) {
            System.out.println("come una torta ahogada");
            peso += 0.050;
        } else {
            System.out.println("come en un carls junior");
            peso += 0.150;
        }

    }
}