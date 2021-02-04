package daw.gheorghe;

/**
 *
 * @author Jorge
 */
public class InstrumentosCuerda extends InstrumentosMusicales {

    private int numeroCuerdas;

    public InstrumentosCuerda(int numeroCuerdas, String nombre, String material, int precio) {
        super(nombre, material, precio);
        this.numeroCuerdas = numeroCuerdas;
    }

    public InstrumentosCuerda() {
    }
    
    @Override
    public void tocar(){
        System.out.println("tocando el instrumento...");
    }
    
    public void cogerInstrumentoCuerda(){
        System.out.println("Has cogido el instrumento de cuerda");
    }
    
    public void arreglarCuerdas(){
        System.out.println("Arreglando cuerdas al instrumento");
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.numeroCuerdas;
        return hash;
    }

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

    @Override
    public String toString() {
        return super.toString() + "InstrumentosCuerda{" + "numeroCuerdas=" + numeroCuerdas + '}';
    }

}
