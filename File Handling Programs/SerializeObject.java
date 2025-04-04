import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializeObject {
    public static void main(String[] args) {
        try {
            Person person = new Person("John", 30);
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.close();
            fos.close();
            System.out.println("Object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
