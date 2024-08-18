import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManagerImpl();

        // Agregar estudiantes
        studentManager.addStudent(new Student(1, "Alice", 22));
        studentManager.addStudent(new Student(2, "Bob", 20));
        studentManager.addStudent(new Student(3, "Charlie", 23));

        // Mostrar todos los estudiantes
        System.out.println("Todos los estudiantes:");
        studentManager.getAllStudents().forEach(System.out::println);

        // Filtrar estudiantes mayores de 21 años
        System.out.println("\nEstudiantes mayores de 21 años:");
        studentManager.getAllStudents().stream()
                .filter(s -> s.getAge() > 21)
                .forEach(System.out::println);

        // Ordenar estudiantes por nombre
        System.out.println("\nEstudiantes ordenados por nombre:");
        studentManager.getAllStudents().stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .forEach(System.out::println);

        // Buscar un estudiante por ID
        try {
            Student student = studentManager.findStudent(1);
            System.out.println("\nEstudiante encontrado: " + student);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Eliminar un estudiante
        try {
            studentManager.removeStudent(2);
            System.out.println("\nEstudiante con ID 2 eliminado.");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Mostrar todos los estudiantes después de la eliminación
        System.out.println("\nTodos los estudiantes después de la eliminación:");
        studentManager.getAllStudents().forEach(System.out::println);
    }
}
// Explicación:
//Agregar Estudiantes: Se crean y se agregan varios estudiantes a la lista.
//Mostrar Todos los Estudiantes: Imprime la lista completa de estudiantes.
//Filtrar Estudiantes Mayores de 21 Años: Usa un filtro con lambda para mostrar solo estudiantes mayores de 21 años.
//Ordenar Estudiantes por Nombre: Ordena los estudiantes por nombre en orden ascendente usando una expresión lambda.
//Buscar Estudiante por ID: Busca un estudiante por su ID y maneja la excepción si no se encuentra.
//Eliminar Estudiante: Elimina un estudiante por su ID y maneja la excepción si no se encuentra.