import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        Producto producto1 = new Producto("Camisa", 50.0, "C001");
        Producto producto2 = new Producto("Zapatos", 120.0, "Z001");
        Producto producto3 = new Producto("Zapatos", 120.0, "Z001");

        agregarProducto(listaProductos, producto1);
        agregarProducto(listaProductos, producto2);
        agregarProducto(listaProductos, producto3);

        System.out.println("producto 1 con prodcuto 2: " + producto1.equals(producto2));
        System.out.println("prodcuto 2 con prodcuto 1: " + producto2.equals(producto1));
        System.out.println("producto 2 con prodcuto 3: " + producto2.equals(producto3));

        System.out.println(listaProductos);
    }
    private static void agregarProducto(List<Producto> lista, Producto producto) {
        if (!lista.contains(producto)) {
            lista.add(producto);
            System.out.println("Producto agregado: " + producto);
        } else {
            System.out.println("Producto duplicado (no agregado): " + producto);
        }
    }
}