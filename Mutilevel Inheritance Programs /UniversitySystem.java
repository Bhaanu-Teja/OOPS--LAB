class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
 
class Student extends Person {
    String studentID;
    
    Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }
    
    void displayStudentDetails() {
        displayInfo();
        System.out.println("Student ID: " + studentID);
    }
}
 
class GraduateStudent extends Student {
    String researchTopic;
    
    GraduateStudent(String name, int age, String studentID, String researchTopic) {
        super(name, age, studentID);
        this.researchTopic = researchTopic;
    }
    
    void displayResearchDetails() {
        displayStudentDetails();
        System.out.println("Research Topic: " + researchTopic);
    }
}
 
public class UniversitySystem {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("Alice Johnson", 25, "G12345", "Artificial Intelligence");
        gradStudent.displayResearchDetails();
    }
}
