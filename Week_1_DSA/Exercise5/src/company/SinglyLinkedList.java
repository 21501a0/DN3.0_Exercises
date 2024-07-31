package company;

public class SinglyLinkedList {
    private Node head;

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        System.out.println("Task " + task.getTaskName() + " added.");
    }

    public Task searchTask(int taskId) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.task.getTaskId() == taskId) {
                return currentNode.task;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.task);
            currentNode = currentNode.next;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null && currentNode.next.task.getTaskId() != taskId) {
            currentNode = currentNode.next;
        }
        if (currentNode.next == null) {
            System.out.println("Task with ID " + taskId + " not found.");
        } else {
            currentNode.next = currentNode.next.next;
            System.out.println("Task with ID " + taskId + " deleted.");
        }
    }
}
