interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft can fly");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane can fly");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter can fly");
    }
}
 
public class questionFive {
    public static void main(String[] args) {
        Spacecraft s = new Spacecraft();
        Airplane a = new Airplane();
        Helicopter h = new Helicopter();
        s.fly_obj();
        a.fly_obj();
        h.fly_obj();
    }
}
