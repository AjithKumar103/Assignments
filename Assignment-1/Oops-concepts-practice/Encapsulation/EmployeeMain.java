package Encapsulation;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ajith","emp-103102","Software Engineer",30000);
        System.out.println(emp1.employeeDetails());
        emp1.setEmployeeID("emp-113112");
        System.out.println(emp1.getRole());
        emp1.setSalary(25000);
        System.out.println(emp1.getSalary());
        System.out.println(emp1.employeeDetails());
    }
}
