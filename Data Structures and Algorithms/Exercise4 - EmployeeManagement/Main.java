public class Main {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(1, "Sathish",
                "Developer", 50000));

        manager.addEmployee(new Employee(2, "Ravi",
                "Tester", 40000));

        manager.traverse();
    }
}