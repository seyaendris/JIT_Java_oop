package lab4;

abstract class Person {
    String name;
    String Id;
    int Age;
    char Gender;

    Person[] getPersonInfo(Person[] arr) {
        for (Person person : arr) {

        }
        return arr;
    }

}

class Employee extends Person {
    Employee(String name, String Id, int Age, char Gender) {
        this.name = name;
        this.Age = Age;
        this.Gender = Gender;
        this.Id = Id;
    }
}

public class javalab4 {
    public static void main(String[] args) {
        Employee[] Employee = { new Employee("name", "id", 12, 'F'),
                new Employee("name", "id", 12, 'F'),
                new Employee("name", "id", 12, 'F'),
                new Employee("name", "id", 12, 'F') };

    }
}
