import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String profesor;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return listaDeEstudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.listaDeEstudiantes = estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (this.listaDeEstudiantes == null) this.listaDeEstudiantes = new ArrayList<Estudiante>();
        if (!listaDeEstudiantes.contains(estudiante)) {
            this.listaDeEstudiantes.add(estudiante);
        }
    }
    public int cantidadDeAlumnos() {
        return listaDeEstudiantes.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nombre).append("\n");
        sb.append("Profesor: ").append(profesor).append("\n");
        sb.append("Cantidad de alumnos: ").append(cantidadDeAlumnos()).append("\n");
        for (int i = 0; i < listaDeEstudiantes.size(); i++) {
            sb.append((i + 1)).append(". ").append(listaDeEstudiantes.get(i)).append("\n");
        }
        return sb.toString();
    }
}
