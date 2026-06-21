public class TaskLinkedList {

    Task head;

    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newTask;
    }

    public void traverse() {

        Task temp = head;

        while (temp != null) {

            System.out.println(temp.taskId + " "
                    + temp.taskName);

            temp = temp.next;
        }
    }
}