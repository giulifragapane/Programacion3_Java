package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciamos productos
        Producto producto = new Producto("AJ450","Air Jordan 450","Adidas",100000);
        Producto producto2 = new Producto("AJ451", "Campus 00", "Adidas", 150000);
        Producto producto3 = new Producto("AJ452", "Nike Air Max", "Nike", 200000);

        //Instanciamos productosRecord con los objetos de productos
        ProductoRecord productoRecord = new ProductoRecord(producto.getCodigo(),producto.getNombre(),producto.getPrecio());
        ProductoRecord productoRecord2 = new ProductoRecord(producto2.getCodigo(),producto2.getNombre(),producto2.getPrecio());
        ProductoRecord productoRecord3 = new ProductoRecord(producto3.getCodigo(),producto3.getNombre(),producto3.getPrecio());

        //Instanciamos productosRecord
        ProductoRecord productoRecord4 = new ProductoRecord("AJ453","Converse All Star",40000);
        // productoRecord4.setCodigo("AJ453"); NO SE PUEDE HACER PORQUE ES FINAL!!!!!

        //Creamos una lista de productosRecord y añadimos TOOODOS los productosrecord
        List<ProductoRecord> productosRecord = new ArrayList<>();
        productosRecord.add(productoRecord);
        productosRecord.add(productoRecord2);
        productosRecord.add(productoRecord3);
        productosRecord.add(productoRecord4);

        //Mostramos la lista de productos record
        System.out.println("LISTA COMPLETA DE PRODUCTOS RECORD");
        for(ProductoRecord pr : productosRecord){
            System.out.println(pr);
        }

        //Mostramos la lista de TOODOS los productos (record y no record)
        System.out.println("LISTA COMPLETA DE PRODUCTOS");
        List<Object> productos = new ArrayList<>();
        productos.add(producto);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(productoRecord);
        productos.add(productoRecord2);
        productos.add(productoRecord3);
        productos.add(productoRecord4);

        productos.forEach(System.out::println); //Equivalente a: productos.forEach(p -> System.out.println(p));
    }
}