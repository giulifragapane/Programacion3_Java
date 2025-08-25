import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        Producto producto1 = new Producto("Camisa", 50.0, "C001");
        Producto producto2 = new Producto("Zapatos", 120.0, "Z001");
        Producto producto3 = new Producto("Zapatos", 120.0, "Z001");
        Producto producto4 = new Producto("Camisa", 50.0, "C001");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);

        System.out.println("producto 1 con producto 2: " + producto1.equals(producto2));
        System.out.println("prodcuto 2 con producto 1: " + producto2.equals(producto1));
        System.out.println("producto 2 con producto 3: " + producto2.equals(producto3));
        System.out.println("producto 1 con producto 4: " + producto1.equals(producto4));

        System.out.println("Lista de productos: ");
        System.out.println(productos);
    }
}