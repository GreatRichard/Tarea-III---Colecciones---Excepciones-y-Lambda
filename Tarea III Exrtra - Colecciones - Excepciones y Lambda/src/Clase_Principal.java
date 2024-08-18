public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // Agregar empleados
        company.addEmployee(new Employee(1, "Alice", "Developer"));
        company.addEmployee(new Employee(2, "Bob", "Manager"));
        company.addEmployee(new Employee(3, "Charlie", "Analyst"));

        // Mostrar empleados antes de convertir el Map a inmutable
        System.out.println("Empleados antes de la inmutabilidad:");
        company.displayEmployees();

        // Convertir a Map inmutable y mostrar el contenido
        System.out.println("\nContenido del Map inmutable:");
        Map<Integer, Employee> immutableMap = company.getImmutableEmployeeMap();
        immutableMap.forEach((id, employee) -> System.out.println(employee));

        // Intentar modificar el Map inmutable
        company.attemptModification();

        // Mostrar empleados después de intentar modificar el Map inmutable
        System.out.println("\nEmpleados después de intentar modificar el Map inmutable:");
        company.displayEmployees();
    }
}