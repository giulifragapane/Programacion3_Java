//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Ana Pérez", 20, "Programación");
        Estudiante e2 = new Estudiante("Juan Gómez", 22, "Programación");
        Estudiante e3 = new Estudiante("Lucía Fernández", 21, "Ing. en Sistemas");
        // Crear curso y agregar estudiantes
        Curso curso1 = new Curso("Estructuras de Datos", "Prof. Carlos Ruiz");
        curso1.agregarEstudiante(e1);
        curso1.agregarEstudiante(e2);
        curso1.agregarEstudiante(e3);
        // Imprimir curso
        System.out.println("CURSO 1");
        System.out.println(curso1);

        // Crear otro curso
        Curso curso2 = new Curso("Ciencias Biológicas", "Prof. Marta López");
        curso2.agregarEstudiante(new Estudiante("Pedro Martínez", 23, "Lic. en Bromatología"));
        curso2.agregarEstudiante(new Estudiante("Sofía Torres", 20, "Prof. en Biología"));
        // Imprimir curso
        System.out.println("CURSO 2");
        System.out.println(curso2);
    }
}