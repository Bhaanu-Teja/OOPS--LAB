class Course {
    String courseName;
    String instructor;
    
    Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }
    
    void displayDetails() {
        System.out.println("Course: " + courseName + ", Instructor: " + instructor);
    }
}
 
class ProgrammingCourse extends Course {
    String language;
    
    ProgrammingCourse(String courseName, String instructor, String language) {
        super(courseName, instructor);
        this.language = language;
    }
    
    void showLanguage() {
        System.out.println(courseName + " is taught in " + language);
    }
}
 
class BusinessCourse extends Course {
    String specialization;
    
    BusinessCourse(String courseName, String instructor, String specialization) {
        super(courseName, instructor);
        this.specialization = specialization;
    }
    
    void showSpecialization() {
        System.out.println(courseName + " focuses on " + specialization);
    }
}
 
public class OnlineLearningPlatform {
    public static void main(String[] args) {
        ProgrammingCourse javaCourse = new ProgrammingCourse("Java Programming", "Alice Johnson", "Java");
        BusinessCourse marketingCourse = new BusinessCourse("Marketing Strategies", "Bob Smith", "Digital Marketing");
 
        javaCourse.displayDetails();
        javaCourse.showLanguage();
        
        marketingCourse.displayDetails();
        marketingCourse.showSpecialization();
    }
}
