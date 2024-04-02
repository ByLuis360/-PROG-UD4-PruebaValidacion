package com.salesianos.examen.electrodomesticos.hijos;

import com.salesianos.examen.electrodomesticos.padre.Electrodomestico;

public class Nevera extends Electrodomestico {
    private int temperatura;

    public Nevera(String marca, String modelo, double peso, double potencia, boolean estaEncendida, int temperatura) {
        super(marca, modelo, peso, potencia, estaEncendida);
        this.temperatura = temperatura;
    }

    @Override
    public void enceder() {
        this.estaEncendida = true;

        System.out.println("¡Ños, fuerte pelete!");
    }

    @Override
    public String toString() {
        String mensaje = "\n ------------------------------------------------------------------------------------------------- \n"
                +
                "* Tipo de electrodoméstico: Nevera.\n" + "* Marca: " + this.marca + "\n" + "* Modelo: " + this.modelo
                + "\n" + "* Peso: " + this.peso + "\n" + "* Potencia: " + this.potencia + "\n" + "* Temperatura: "
                + this.temperatura + "\n" + "* Está encendido: ";
        mensaje += this.estaEncendida ? "Si"
                : "No" +
                        "\n ------------------------------------------------------------------------------------------------- \n";

        return mensaje;
    }

}
