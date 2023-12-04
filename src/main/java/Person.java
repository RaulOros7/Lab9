import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person("AsD", 28);
        ObjectMapper objectMapper = new ObjectMapper();
        Person person2 = new Person("AsD", 28);
        objectMapper.writeValue(new File("C:\\Users\\cti22b208\\IdeaProjects\\Lab9\\Person.txt"), person1);
    }

}


