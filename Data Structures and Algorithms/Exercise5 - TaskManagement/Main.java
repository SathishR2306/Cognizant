public class Main {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.addTask(1, "Coding", "Pending");
        list.addTask(2, "Testing", "Completed");

        list.traverse();
    }
}