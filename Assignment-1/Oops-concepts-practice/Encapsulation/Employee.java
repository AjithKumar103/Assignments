package Encapsulation;

public class Employee {
    private String name;
    private String employeeID;
    private String role;
    private double salary;
    public Employee(){

    }

    public Employee(String name, String employeeID, String role, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String employeeDetails() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
