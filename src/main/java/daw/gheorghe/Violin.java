package daw.gheorghe;

/**
 *
 * @author Jorge
 */
public class Violin extends InstrumentosCuerda {

    private double tamanio;

    public Violin(double tamanio, int numeroCuerdas, String nombre, String material, int precio) {
        super(numeroCuerdas, nombre, material, precio);
        this.tamanio = tamanio;
    }

    public Violin() {

    }
    
    @Override
    public void tocar(){
        System.out.println("tocando el violin...");
    }
    
    public void cogerViolin(){
        System.out.println("Has cogido el violin");
    }
    
    @Override
    public void arreglarCuerdas(){
        System.out.println("Arreglando cuerdas al instrumento");
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.tamanio) ^ (Double.doubleToLongBits(this.tamanio) >>> 32));
        return hash;
    }

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

    @Override
    public String toString() {
        return super.toString() + "Violin{" + "tamanio=" + tamanio + '}';
    }

}
