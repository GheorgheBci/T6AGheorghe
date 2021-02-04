package daw.gheorghe;

import java.util.Objects;

/**
 *
 * @author Jorge
 */
public class Guitarra extends InstrumentosCuerda {

    private String tipoGuitarra;

    public Guitarra(String tipoGuitarra, int numeroCuerdas, String nombre, String material, int precio) {
        super(numeroCuerdas, nombre, material, precio);
        this.tipoGuitarra = tipoGuitarra;
    }

    public Guitarra() {

    }
    
    @Override
    public void tocar(){
        System.out.println("tocando el instrumento...");
    }

    public String getTipoGuitarra() {
        return tipoGuitarra;
    }

    public void setTipoGuitarra(String tipoGuitarra) {
        this.tipoGuitarra = tipoGuitarra;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.tipoGuitarra);
        return hash;
    }

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

    @Override
    public String toString() {
        return super.toString() + "Guitarra{" + "tipoGuitarra=" + tipoGuitarra + '}';
    }

}
