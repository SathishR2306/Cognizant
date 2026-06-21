public class EmployeeManager {

    Employee[] employees = new Employee[100];
    int count = 0;

    public void addEmployee(Employee e) {
        employees[count++] = e;
    }

    public void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {
                System.out.println(employees[i].name);
                return;
            }
        }

        System.out.println("Not Found");
    }

    public void traverse() {

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].name);
        }
    }

    public void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                count--;
                break;
            }
        }
    }
}