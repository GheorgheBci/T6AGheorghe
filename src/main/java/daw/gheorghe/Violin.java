package daw.gheorghe;

/**
 *
 * @author Jorge
 */
public class Violin extends InstrumentosCuerda {

    // Atributos privados de la clase Violin
    private double tamanio;

    // Constructor parametrizado
    public Violin(double tamanio, int numeroCuerdas, String material, int precio) {
        super(numeroCuerdas, material, precio);
        this.tamanio = tamanio;
    }

    // Constructor por defecto
    public Violin() {

    }

    // Método sobreescrito
    @Override
    public void tocar() {
        System.out.println("tocando el violin...");
    }

    // Método propio de la clase
    public void cogerViolin() {
        System.out.println("Has cogido el violin");
    }

    // Método sobreescrito
    @Override
    public void arreglarCuerdas() {
        System.out.println("Arreglando cuerdas al instrumento");
    }

    // Métodos getters y setters
    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    // Método hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.tamanio) ^ (Double.doubleToLongBits(this.tamanio) >>> 32));
        return hash;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        final Violin other = (Violin) obj;

        if (Double.doubleToLongBits(this.tamanio) != Double.doubleToLongBits(other.tamanio)) {
            return false;
        }
        return true;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "Violin{" + "tamanio=" + tamanio + '}';
    }

}
