package org.example;

public record ProductoRecord(String codigo, String nombre, double precio) {
    //ES INMUTABLE:
    // - NOOO TIENE SETTERS
    // - TODOS LOS CAMPOS SON FINAL
    // - JAVA GENERA AUTOMATICAMENTE CONSTRUCTORES, GETTERS Y TOSTRING, EQUALS Y HASHCODE
}
