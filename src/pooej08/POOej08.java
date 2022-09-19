/*
 * @author NeuenMartinez
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a 
través de los métodos set, se guardará la frase y la longitud de manera automática según 
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos: 
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
ingresada. 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package POOej08;

import Entidades08.Cadena;
import Servicios08.CadenaService;
import java.util.Scanner;

public class POOej08 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar una frase:");
        String texto = leer.next();
        Cadena c1 = new Cadena();
        c1.setFrase(texto);
        c1.setTamaño(texto.length());
        CadenaService cs = new CadenaService();
        System.out.println("La catidad de vocales en la frase ingresada es de: " + cs.contarVocales(c1));
        cs.invertirFrase(c1);
        System.out.println("La catidad de veces que se encuentra la letra ingresada en la frase es de: " + cs.vecesRepetidos(c1));
        System.out.println("Ingresar una nueva frase:");
        String texto2 = leer.next();
        cs.compararLongitud(c1, texto2);
        System.out.println("Ingresar una nueva frase:");
        String texto3 = leer.next();
        cs.unirFrases(c1, texto3);
        System.out.println("Ingresar una letra: ");
        String letra = leer.next();
        cs.reemplazar(c1, letra);
        System.out.println("Ingresar una letra: ");
        String letra2 = leer.next();
        System.out.println("La frase contiene la letra ingresada?: " + cs.contiene(c1, letra2));

    }

}
