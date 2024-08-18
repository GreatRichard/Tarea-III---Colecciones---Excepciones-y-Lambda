public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
// Explicación:
//Excepción Personalizada: StudentNotFoundException extiende Exception y se utiliza cuando un estudiante no se encuentra en la lista.