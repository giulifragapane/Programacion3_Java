package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuario = Usuario.builder()
                .id(1)
                .nombre("Diego")
                .email("diego@gmail.com")
                .build();
        System.out.println("INFORMACIÓN DEL USUARIO:");
        System.out.println("NOMBRE:" + usuario.getNombre());
        System.out.println("EMAIL:" + usuario.getEmail());
        System.out.println("CAMBIAMOS MAIL:");
        usuario.setEmail("diego2@gmail.com");
        System.out.println("EMAIL:" + usuario.getEmail());
        System.out.println("MOSTRAR USUARIO CON TO STRING:");
        System.out.println(usuario);
        //COMO COLOQUÉ EL ID ESTILO FINAL, NO SE PUEDE CAMBIAR
        //usuario.setId(2);
    }
}