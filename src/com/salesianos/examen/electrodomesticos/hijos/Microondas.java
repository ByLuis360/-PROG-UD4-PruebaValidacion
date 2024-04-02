package com.salesianos.examen.electrodomesticos.hijos;

import com.salesianos.examen.electrodomesticos.padre.Electrodomestico;

public class Microondas extends Electrodomestico {
    private boolean puertaestaAbierta;

    public Microondas(String marca, String modelo, double peso, double potencia, boolean estaEncendida,
            boolean puertaestaAbierta) {
        super(marca, modelo, peso, potencia, estaEncendida);
        this.puertaestaAbierta = puertaestaAbierta;
    }

    @Override
    public void enceder() {
        this.estaEncendida = true;

        System.out.println("Algo huele a quemado");
    }

    public void abierta() {
        this.puertaestaAbierta = true;

    }

    @Override
    public String toString() {
        String mensaje = "\n ------------------------------------------------------------------------------------------------- \n"
                +
                "* Tipo de electrodoméstico: Microondas.\n" + "* Marca: " + this.marca + "\n" + "* Modelo: "
                + this.modelo
                + "\n" + "* Peso: " + this.peso + "\n" + "* Potencia: " + this.potencia + "\n" + "* Puerta: ";
        mensaje += this.puertaestaAbierta ? "Si \n" : "No\n" + "\n";
        mensaje += "* Está encendido: ";
        mensaje += this.estaEncendida ? "Si"
                : "No" +
                        "\n ------------------------------------------------------------------------------------------------- \n";
        return mensaje;
    }
}
