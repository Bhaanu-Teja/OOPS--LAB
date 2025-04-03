class Employee {
    String name;
    int empID;
    double salary;
 
    Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }
 
    void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
 
class Manager extends Employee {
    String department;
 
    Manager(String name, int empID, double salary, String department) {
        super(name, empID, salary);
        this.department = department;
    }
 
    void displayManagerInfo() {
        displayInfo();  
        System.out.println("Department: " + department);
    }
}
 
public class EmpMan {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice Johnson", 1001, 75000, "IT");
        mgr.displayManagerInfo();
    }
}
