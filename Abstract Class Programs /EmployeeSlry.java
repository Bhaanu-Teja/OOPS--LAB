abstract class Employee {
    String name;
    double baseSalary;
 
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
 
    abstract double calculateSalary();
}
 
class Manager extends Employee {
    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
 
    @Override
    double calculateSalary() {
        return baseSalary + 5000; // Bonus for Managers
    }
}
 
class Developer extends Employee {
    Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }
 
    @Override
    double calculateSalary() {
        return baseSalary + 3000; // Bonus for Developers
    }
}
 
public class EmployeeSlry {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 60000);
        Employee developer = new Developer("Bob", 50000);
 
        System.out.println("Manager Salary: $" + manager.calculateSalary());
        System.out.println("Developer Salary: $" + developer.calculateSalary());
    }
}
