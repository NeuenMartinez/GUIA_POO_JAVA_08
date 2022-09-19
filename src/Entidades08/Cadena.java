package Entidades08;

/**
 *
 * @author NeuenMartinez
 */
public class Cadena {

    private String frase;
    private int tamaño;

    public Cadena() {
    }

    public Cadena(String frase, int tamaño) {
        this.frase = frase;
        this.tamaño = tamaño;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

}
