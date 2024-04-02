package com.salesianos.examen.calculos;

public class Calculadora {

    public static int sumarCuadradosN(int n) {
        int sumar = 1;
        for (int i = 2; i <= n; i++) {
            sumar += Math.pow(i, 2);
        }
        return sumar;
    }

    public static void calcularMediaNotas() {
        int[] notas = { 10, 4, 6, 1, 7 };
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];

        }
        System.out.println(suma / notas.length);
    }
}
