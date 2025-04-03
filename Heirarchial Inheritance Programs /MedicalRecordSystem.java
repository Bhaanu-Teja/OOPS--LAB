class Patient {
    String name;
    int age;
    
    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayInfo() {
        System.out.println("Patient Name: " + name + ", Age: " + age);
    }
}
 
class Inpatient extends Patient {
    int roomNumber;
    
    Inpatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }
    
    void showAdmissionDetails() {
        System.out.println(name + " is admitted in Room " + roomNumber);
    }
}
 
class Outpatient extends Patient {
    String doctorName;
    
    Outpatient(String name, int age, String doctorName) {
        super(name, age);
        this.doctorName = doctorName;
    }
    
    void showConsultationDetails() {
        System.out.println(name + " has a consultation with Dr. " + doctorName);
    }
}
 
public class MedicalRecordSystem {
    public static void main(String[] args) {
        Inpatient inpatient = new Inpatient("John Doe", 45, 302);
        Outpatient outpatient = new Outpatient("Emma Brown", 30, "Dr. Wilson");
 
        inpatient.displayInfo();
        inpatient.showAdmissionDetails();
 
        outpatient.displayInfo();
        outpatient.showConsultationDetails();
    }
}
