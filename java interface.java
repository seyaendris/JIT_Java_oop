package lab4;

interface World {
    // abstract void displayDetials();

    // void canMove();

    // void canEat();

    int getTotalNum(int... x);
}

abstract class Livingthings {
    String name;
    String Id;
    int Age;
    char Gender;

    abstract int calSum(int... num);

    // void getList(Livingthings[] arr) {
    // for (Livingthings each : arr) {
    // this.Age = each.Age;
    // this.
    // }
    // }
}

class Animal extends Livingthings implements World {
    Animal() {

    }

    Animal(String name, String Id, int Age, char Gender) {
        this.name = name;
        this.Age = Age;
        this.Gender = Gender;
        this.Id = Id;
    }

    Animal(Animal[] list) {
        for (Animal each : list) {
            this.name = each.name;
            this.Age = each.Age;
            this.Gender = each.Gender;
            this.Id = each.Id;
        }
    }

    void Info(Animal[] list) {
        for (Animal animal : list) {
            System.out.println("name: " + animal.name + " age: " + animal.Age);
        }
    }

    public int getTotalNum(int... x) {

        return 0;
    }

    int calSum(int... num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }

}

public class Main {

    public static void main(String[] args) {
        Animal[] Dog = { new Animal("name", "id", 12, 'F'),
                new Animal("racky", "id", 12, 'F'),
                new Animal("pupy", "id", 12, 'F'),
                new Animal("jacky", "id", 12, 'F') };

        Animal doglist = new Animal();
        doglist.Info(Dog);
    }
}
