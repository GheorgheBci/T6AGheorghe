package daw.gheorghe;

import java.util.Objects;
/**
 *
 * @author Jorge
 */
public class InstrumentosMusicales {

    private String nombre;
    private String material;
    private int precio;

    public InstrumentosMusicales(String nombre, String material, int precio) {
        this.nombre = nombre;
        this.material = material;
        this.precio = precio;
    }

    public InstrumentosMusicales() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.material);
        hash = 29 * hash + this.precio;
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
        final InstrumentosMusicales other = (InstrumentosMusicales) obj;
        if (this.precio != other.precio) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InstrumentosMusicales{" + "nombre=" + nombre + ", material=" + material + ", precio=" + precio + '}';
    }

}
