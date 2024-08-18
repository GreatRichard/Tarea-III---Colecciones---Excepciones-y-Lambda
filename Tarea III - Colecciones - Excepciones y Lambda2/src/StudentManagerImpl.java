import java.util.List;
import java.util.Optional;

public class StudentManagerImpl implements StudentManager {
    private GenericList<Student> students = new GenericList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int id) throws StudentNotFoundException {
        Student student = findStudent(id);
        students.remove(student);
    }

    @Override
    public Student findStudent(int id) throws StudentNotFoundException {
        Optional<Student> student = students.getAll().stream()
                .filter(s -> s.getId() == id)
                .findFirst();
        if (student.isPresent()) {
            return student.get();
        } else {
            throw new StudentNotFoundException("Student with id " + id + " not found.");
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return students.getAll();
    }
}
//Explicación:
//addStudent(): Agrega un estudiante a la lista.
//removeStudent(): Elimina un estudiante de la lista, lanzando una excepción si no se encuentra.
//findStudent(): Busca un estudiante por ID usando Streams y lanza una excepción si no lo encuentra.
//getAllStudents(): Devuelve la lista completa de estudiantes.