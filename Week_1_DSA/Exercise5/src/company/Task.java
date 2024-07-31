package company;

public class Task {
    private int id;
    private String name;
    private String status;

    public Task(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Task ID: ").append(id)
          .append(", Task Name: ").append(name)
          .append(", Status: ").append(status);
        return sb.toString();
    }
}
