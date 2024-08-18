public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Sobrescribimos el método toString() para una representación legible
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//Explicación:
//Atributos: id, name, y age son privados para encapsular los datos del estudiante.
//Constructor: Inicializa los atributos cuando se crea una nueva instancia de Student.
//Getters y Setters: Permiten acceder y modificar los atributos de forma controlada.
//toString(): Proporciona una representación en texto del objeto Student, útil para imprimirlo en la consola.