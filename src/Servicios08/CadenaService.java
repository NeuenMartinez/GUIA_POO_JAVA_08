package Servicios08;

import Entidades08.Cadena;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class CadenaService {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int cont = 0;

    public int contarVocales(Cadena c1) {
        String texto = c1.getFrase();
        for (int i = 0; i < c1.getTamaño(); i++) {
            if (texto.substring(i, i + 1).equalsIgnoreCase("A") || texto.substring(i, i + 1).equalsIgnoreCase("E") || texto.substring(i, i + 1).equalsIgnoreCase("I") || texto.substring(i, i + 1).equalsIgnoreCase("O") || texto.substring(i, i + 1).equalsIgnoreCase("U")) {
                cont++;

            }

        }
        return cont;
    }

    public void invertirFrase(Cadena c1) {
        String texto = c1.getFrase();
        int longitud = c1.getTamaño();
        System.out.println("La frase invertida es:");
        for (int i = longitud; i > 0; i--) {
            System.out.print(texto.substring(i - 1, i));
        }
        System.out.println("");
    }

    public int vecesRepetidos(Cadena c1) {
        String texto = c1.getFrase();
        cont = 0;
        System.out.println("Ingresar una letra a buscar:");
        String letra = leer.next();
        for (int i = 0; i < c1.getTamaño(); i++) {
            if (texto.substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        return cont;

    }

    public void compararLongitud(Cadena c1, String texto) {
        if (c1.getTamaño() > texto.length()) {
            System.out.println("La primera frase es mas larga que la segunda");
        } else if (c1.getTamaño() < texto.length()) {
            System.out.println("La segunda frase es mas larga que la primera");
        } else {
            System.out.println("Las frases tienen el mismo tamaño");
        }
    }

    public void unirFrases(Cadena c1, String texto) {
        System.out.println("Las frases unidas son: " + c1.getFrase().concat(" " + texto));
    }

    public void reemplazar(Cadena c1, String letra) {
        System.out.println("La frase con la letra reemplazada seria:");
        for (int i = 0; i < c1.getTamaño(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase("A")) {
                System.out.print(letra);

            } else {
                System.out.print(c1.getFrase().substring(i, i + 1));
            }
            System.out.println("");
        }
    }

    public boolean contiene(Cadena c1, String letra2) {
        boolean aux = false;
        for (int i = 0; i < c1.getTamaño(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase(letra2)) {
                aux = true;
            }
        }
        return aux;
    }
}
