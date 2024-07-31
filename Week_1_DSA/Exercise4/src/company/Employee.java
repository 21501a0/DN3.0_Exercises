package company;

public class Employee {
    private int id;
    private String fullName;
    private String jobTitle;
    private double annualSalary;

    public Employee(int id, String fullName, String jobTitle, double annualSalary) {
        this.id = id;
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.annualSalary = annualSalary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + fullName + ", Position: " + jobTitle + ", Salary: " + String.format("%.2f", annualSalary);
    }
}
