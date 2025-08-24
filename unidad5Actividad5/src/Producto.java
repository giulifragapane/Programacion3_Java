import java.util.Objects;

public class Producto {
    private String nombre;
    private double precio;
    private String codigo;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //si es el mismo objecto en la memoria -> true
        if (o == null || getClass() != o.getClass()) return false; // Si no es un Producto → false
        Producto producto = (Producto) o;
        return nombre.equals(producto.nombre) && precio == producto.precio && codigo.equals(producto.codigo);
        //return o.equals(codigo); (otra forma de hacer)
        // Compara solo el código
        // Esto significa que dos productos son iguales si tienen el mismo código,
        // sin importar si el nombre o precio son distintos.
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, codigo);
    }
}
