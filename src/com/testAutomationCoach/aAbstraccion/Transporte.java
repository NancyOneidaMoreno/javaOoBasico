package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.cMethods.Persona;

public class Transporte {
        double Velocidad;
        int NumeroPasajeros;
        String Color;
        Persona Conductor;
        Iluminacion foco;

    //Autobus
    //Avion
    //Carro
    //Bicicleta
    //Patines
    //Barco
    //Patin
    //Motocicleta

}
class Iluminacion {
    //NumFocos
}

class Autobus extends Transporte {
    //Ruta
    //Tarifa
    //NumLlantas
}

class Avion extends Transporte {
    //Tarifa
    //Rutas
    //Altitud
    //NumLlantas
    //Combustible
}

class Carro extends Transporte {
    //NumLlantas
    //Combustible
    //NumPuertas
    //Accesorios
    //Tarifa
}

class Barco extends Transporte {
    //Combustible
    //BalsasSalvavidas
    //ChalecosSalvavidas
    //Velas
    //Mastil
    //Ancla
    //Tarifa
}

class Patines extends Transporte{
    //NumRuedas
    //TipoPatin
    //Talla
}

class Bicicleta extends Transporte{
    //NumRuedas
    //TipoBicicleta
    //NumAsientos
    //Material
    //TipoFrenos
    //CantidadVelocidades
}
