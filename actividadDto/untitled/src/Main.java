import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creamos objetos Producto
        Producto producto = new Producto("A123", "Licuadora", 10000, "Liliana");
        Producto producto2 = new Producto("A124", "Cafetera", 20000, "Atma");

        //Creamos objetos ProductoDTO
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setCodigo(producto.getCodigo());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setPrecio(producto.getPrecio());
        ProductoDTO productoDTO2 = new ProductoDTO();
        productoDTO2.setCodigo(producto2.getCodigo());
        productoDTO2.setNombre(producto2.getNombre());
        productoDTO2.setPrecio(producto2.getPrecio());

        //Guardamos los productosDTO en una lista
        List<ProductoDTO> listaDTO = new ArrayList<ProductoDTO>();
        listaDTO.add(productoDTO);
        listaDTO.add(productoDTO2);

        System.out.println("Lista de ProductoDTO:");
        for(ProductoDTO p : listaDTO) {
            System.out.println(p);
        }
    }
}