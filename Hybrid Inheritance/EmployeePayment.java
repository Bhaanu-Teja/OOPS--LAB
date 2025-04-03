class Employee {
    String name;
    
    Employee(String name) {
        this.name = name;
    }
    
    void showName() {
        System.out.println("Employee Name: " + name);
    }
}
 
interface SalaryEmployee {
    void calculateSalary();
}
 
interface HourlyEmployee {
    void calculateWage(int hoursWorked);
}
 
class FullTimeEmployee extends Employee implements SalaryEmployee {
    double monthlySalary;
    
    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    
    public void calculateSalary() {
        System.out.println(name + "'s Monthly Salary: $" + monthlySalary);
    }
}
 
class PartTimeEmployee extends Employee implements HourlyEmployee {
    double hourlyRate;
    PartTimeEmployee(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }
    public void calculateWage(int hoursWorked) {
        System.out.println(name + "'s Wage for " + hoursWorked + " hours: $" + (hourlyRate * hoursWorked));
    }
}
class HybridEmployee extends FullTimeEmployee implements HourlyEmployee {
    double hourlyRate;
    
    HybridEmployee(String name, double monthlySalary, double hourlyRate) {
        super(name, monthlySalary);
        this.hourlyRate = hourlyRate;
    }
    public void calculateWage(int hoursWorked) {
        System.out.println(name + "'s Extra Wage for " + hoursWorked + " hours: $" + (hourlyRate * hoursWorked));
    }
}
public class EmployeePayment {
    public static void main(String[] args) {
        HybridEmployee hybridEmp = new HybridEmployee("John Doe", 5000, 25);
        
        hybridEmp.showName();
        hybridEmp.calculateSalary();
        hybridEmp.calculateWage(10); // 10 extra hours of part-time work
    }
}
