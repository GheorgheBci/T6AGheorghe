package daw.gheorghe;

/**
 *
 * @author Jorge
 */
public class InstrumentosCuerda extends InstrumentosMusicales {

    // Atributos privados de la clase InstrumentosCuerda
    private int numeroCuerdas;

    // Constructor parametrizado
    public InstrumentosCuerda(int numeroCuerdas, String material, int precio) {
        super(material, precio);
        this.numeroCuerdas = numeroCuerdas;
    }

    // Constructor por defecto
    public InstrumentosCuerda() {
    }

    // Método sobreescrito
    @Override
    public void tocar() {
        System.out.println("tocando el instrumento de cuerda...");
    }

    // Método propio de la clase
    public void cogerInstrumentoCuerda() {
        System.out.println("Has cogido el instrumento de cuerda");
    }

    // Método polimórfico
    public void arreglarCuerdas() {
        System.out.println("Arreglando cuerdas al instrumento");
    }

    // Métodos getters y setters
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    // Método hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.numeroCuerdas;
        return hash;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InstrumentosCuerda other = (InstrumentosCuerda) obj;
        if (this.numeroCuerdas != other.numeroCuerdas) {
            return false;
        }
        return true;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "InstrumentosCuerda{" + "numeroCuerdas=" + numeroCuerdas + '}';
    }

}
