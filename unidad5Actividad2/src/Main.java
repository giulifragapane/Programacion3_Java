import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Estudiante> listaEstudiantes = new ArrayList<>();

        Estudiante estudiante = new Estudiante("Juan", 20, "Informática");
        Estudiante estudiante2 = new Estudiante("María", 22, "Diseño Gráfico");
        Estudiante estudiante3 = new Estudiante("Pedro", 21, "Medicina");
        Estudiante estudiante4 = new Estudiante("Ana", 25, "Periodismo");

        listaEstudiantes.add(estudiante);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);
        
        //Forma de imprimir estudiante por estudiante con toString
        System.out.println("Imprimimos cada estudiante:");
        for (Estudiante estud : listaEstudiantes) {
            System.out.println(estud);
        }

        //Forma de imprimir con toString la lista
        System.out.println("Imprimimos la lista de estudiantes:");
        System.out.println(listaEstudiantes);
    }
}