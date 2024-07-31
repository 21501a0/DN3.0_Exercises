package company;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.addTask(new Task(1, "Design system architecture", "In Progress"));
        linkedList.addTask(new Task(2, "Develop front-end", "Pending"));
        linkedList.addTask(new Task(3, "Set up CI/CD pipeline", "Completed"));
        System.out.println();

        Task foundTask = linkedList.searchTask(2);
        if (foundTask != null) {
            System.out.println("Found: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }
        System.out.println();

        System.out.println("All tasks:");
        linkedList.traverseTasks();
        System.out.println();

        linkedList.deleteTask(2);
        System.out.println();

        System.out.println("All tasks after deletion:");
        linkedList.traverseTasks();
    }
}
