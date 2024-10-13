import java.util.*;

class negativeRadius extends Exception {
    negativeRadius(String s) {
        super(s);
    }
}
public class questionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int rad = sc.nextInt();
        try {
            if(rad < 0) {
                throw new negativeRadius("Radius cannot be negative");
            }
        }
        catch(negativeRadius e) {
            System.out.println(e);
        }
        double area = 3.14 * rad * rad;
        System.out.println("Area of the circle: " + area + " sq units"); 
    }
}
