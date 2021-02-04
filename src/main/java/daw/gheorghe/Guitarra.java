package daw.gheorghe;

import java.util.Objects;

/**
 *
 * @author Jorge
 */
public class Guitarra extends InstrumentosCuerda {

    // Atributos privados de la clase Guitarra
    private String tipoGuitarra;

    // Constructor parametrizado
    public Guitarra(String tipoGuitarra, int numeroCuerdas, String material, int precio) {
        super(numeroCuerdas, material, precio);
        this.tipoGuitarra = tipoGuitarra;
    }

    // Constructor por defecto
    public Guitarra() {

    }

    // Método sobreescrito
    @Override
    public void tocar() {
        System.out.println("tocando la guitarra...");
    }

    // Método propio de la clase
    public void cogerGuitarra() {
        System.out.println("Has cogido la guitarra");
    }

    // Método sobreescrito
    @Override
    public void arreglarCuerdas() {
        System.out.println("Arreglando cuerdas al instrumento");
    }

    // Métodos getters y setters
    public String getTipoGuitarra() {
        return tipoGuitarra;
    }

    public void setTipoGuitarra(String tipoGuitarra) {
        this.tipoGuitarra = tipoGuitarra;
    }

    // Método hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.tipoGuitarra);
        return hash;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        final Guitarra other = (Guitarra) obj;

        if (!Objects.equals(this.tipoGuitarra, other.tipoGuitarra)) {
            return false;
        }
        return true;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "Guitarra{" + "tipoGuitarra=" + tipoGuitarra + '}';
    }

}
