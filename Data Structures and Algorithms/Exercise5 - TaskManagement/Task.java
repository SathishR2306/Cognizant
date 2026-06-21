public class Task {

    int taskId;
    String taskName;
    String status;

    public Task next;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }
}