package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //PROBANDO @SETTER, @GETTER, @NOARGSCONSTRUCTOR, @ALLARGSCONSTRUCTOR, @TOSTRING
        Persona persona = new Persona();
        System.out.println("Persona sin info: " + persona); //Constructor vacío pone por defecto
        //nombre = null y edad = 0

        persona.setEdad(24);
        persona.setNombre("Emiliano");
        System.out.println("Nombre y edad seteados en persona: " + persona);

        System.out.println("Persona getNombre: " + persona.getNombre());

        //PROBANDO @DATA
        PersonaDATA personaDATA = new PersonaDATA();
        System.out.println("PersonaDATA sin info: " + personaDATA); //con Data pone por defecto
        //nombre = null y edad = 0 TAMBIÉN

        personaDATA.setEdad(20);
        personaDATA.setNombre("Giuliana");
        System.out.println("Nombre y edad seteados en personaDATA: " + personaDATA);

        System.out.println("PersonaDATA getNombre: " + personaDATA.getNombre());

        //PROBANDO... la clase Persona NO tiene hashCode() y equals() por eso da false
        Persona persona2 = new Persona("Juan", 20);
        Persona persona3 = new Persona("Juan", 20);
        System.out.println("persona2.equals(persona3): " + persona2.equals(persona3));
        System.out.println("persona2.hashCode(): " + persona2.hashCode());
        System.out.println("persona3.hashCode(): " + persona3.hashCode());

        //PROBANDO... la clase PersonaDATA si tiene hashCode() y equals() por eso da true
        //PersonaDATA personaDATA2 = new PersonaDATA("Giuliana", 20); con @Data NO puedo generar constructor vacío
        // si los atributos NO SON FINAL ni tampoco tienen @NonNull
        PersonaDATA personaDATA2 = new PersonaDATA();
        personaDATA2.setEdad(40);
        personaDATA2.setNombre("Juan");
        PersonaDATA personaDATA3 = new PersonaDATA();
        personaDATA3.setEdad(40);
        personaDATA3.setNombre("Juan");
        System.out.println("personaDATA2.equals(personaDATA3): " + personaDATA2.equals(personaDATA3));
        System.out.println("personaDATA2.hashCode(): " + personaDATA2.hashCode());
        System.out.println("personaDATA3.hashCode(): " + personaDATA3.hashCode());

        //PROBANDO... la clase Persona con @EQUALSANDHASHCODE POR EDAD
        Persona persona4 = new Persona("Juan", 20);
        Persona persona5 = new Persona("Pedro", 20);
        System.out.println("persona4.equals(persona5): " + persona4.equals(persona5));
        System.out.println("persona4.hashCode(): " + persona4.hashCode());
        System.out.println("persona5.hashCode(): " + persona5.hashCode());
    }
}