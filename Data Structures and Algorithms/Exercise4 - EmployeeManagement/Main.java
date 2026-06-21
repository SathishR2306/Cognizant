public class Main {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(1, "Sathish", "Developer", 50000));
        manager.addEmployee(new Employee(2, "Ravi", "Tester", 40000));
        manager.addEmployee(new Employee(3, "Teja", "Manager", 80000));
        manager.addEmployee(new Employee(4, "Vidhya", "Designer", 45000));
        manager.addEmployee(new Employee(5, "Mani", "HR", 35000));

        System.out.println("All Employees:");
        manager.traverse();

        System.out.println("\nSearching for Employee with ID 3:");
        manager.searchEmployee(3);

        System.out.println("\nSearching for Employee with ID 99:");
        manager.searchEmployee(99);

        System.out.println("\nDeleting Employee with ID 2 (Ravi)...");
        manager.deleteEmployee(2);

        System.out.println("\nEmployees after deletion:");
        manager.traverse();
    }
}