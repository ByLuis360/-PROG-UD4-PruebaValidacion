import com.salesianos.examen.calculos.Calculadora;
import com.salesianos.examen.electrodomesticos.hijos.Microondas;
import com.salesianos.examen.electrodomesticos.hijos.Nevera;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 3;
        System.out.println(Calculadora.sumarCuadradosN(n));
        Calculadora.calcularMediaNotas();

        Microondas microondas = new Microondas("Ferrari", "mega super a 3000", 50, 20, false, false);
        microondas.enceder();
        microondas.abierta();
        Nevera nevera = new Nevera("Apple", "Nevera1pro", 100, 50, false, 80);
        nevera.enceder();
        System.out.println(microondas.toString());
        System.out.println(nevera.toString());
    }
}
