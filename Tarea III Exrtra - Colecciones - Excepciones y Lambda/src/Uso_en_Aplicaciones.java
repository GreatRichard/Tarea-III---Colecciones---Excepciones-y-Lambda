import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Employee {
    private int id;
    private String name;
    private String position;

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

class Company {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    // Método para agregar empleados a un Map mutable
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    // Método para convertir el Map en un Map inmutable y mostrar el contenido
    public Map<Integer, Employee> getImmutableEmployeeMap() {
        return Collections.unmodifiableMap(employeeMap);
    }

    // Intentar modificar el Map inmutable y manejar excepciones
    public void attemptModification() {
        Map<Integer, Employee> immutableMap = getImmutableEmployeeMap();
        try {
            immutableMap.put(4, new Employee(4, "David", "Designer"));
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: No se puede modificar el Map inmutable de empleados.");
        }
    }

    public void displayEmployees() {
        employeeMap.forEach((id, employee) -> System.out.println(employee));
    }
}
