abstract class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    abstract String getGrade();
}
class HighSchoolStudent extends Student {
    HighSchoolStudent(String name, int marks) {
        super(name, marks);
    }
    @Override
    String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else return "Fail";
    }
}
 
class UniversityStudent extends Student {
    UniversityStudent(String name, int marks) {
        super(name, marks);
    }
 
    @Override
    String getGrade() {
        if (marks >= 85) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 65) return "C";
        else return "Fail";
    }
}
 
public class StudentResult {
    public static void main(String[] args) {
        Student s1 = new HighSchoolStudent("John", 85);
        Student s2 = new UniversityStudent("Alice", 78);
 
        System.out.println(s1.name + " Grade: " + s1.getGrade());
        System.out.println(s2.name + " Grade: " + s2.getGrade());
    }
}
