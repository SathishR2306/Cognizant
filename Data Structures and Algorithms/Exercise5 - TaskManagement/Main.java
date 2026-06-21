public class Main {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.addTask(1, "Coding", "In Progress");
        list.addTask(2, "Testing", "Pending");
        list.addTask(3, "Documentation", "Pending");
        list.addTask(4, "Code Review", "Completed");
        list.addTask(5, "Deployment", "Pending");

        list.traverse();
    }
}