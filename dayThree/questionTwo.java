
class Animal {
    int age;
    String name;

    Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Herbivore extends Animal {
    String type;
    Herbivore(int age, String name, String type) {
        super(age, name);
        this.type = type;
    }

    void details() {
        System.out.println("Name of herbivorous animal: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
    }
}

class Carnivore extends Animal {
    String type;
    Carnivore(int age, String name, String type) {
        super(age, name);
        this.type = type;
    }

    void details() {
        System.out.println("Name of carnivorous animal: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
    }
}

class questionTwo {
    public static void main(String[] args) {
        Herbivore herbivore = new Herbivore(5, "Deer", "Mammal");
        Carnivore carnivore = new Carnivore(10, "Lion", "Mammal");
        Herbivore herbivore2 = new Herbivore(3, "Rabbit", "Mammal");
        Carnivore carnivore2 = new Carnivore(7, "Tiger", "Mammal");

        herbivore.details();
        carnivore.details();
        herbivore2.details();
        carnivore2.details();
        
    }
}