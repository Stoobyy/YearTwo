import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to reverse: ");
            int num = sc.nextInt();
            int reversed = 0;
            for(int i = num; i>0; i/=10)
            {
                reversed *= 10;
                reversed += i%10;
            }
            System.out.println("Reversed number is " + reversed);
        }
    }
}
