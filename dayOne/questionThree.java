import java.util.Scanner;

public class questionThree {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter operator:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
            int operator = sc.nextInt();
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            switch(operator)
            {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Result: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Invalid operator");

            }
            System.out.println("Do you want to continue? (1 for Yes/0 for No)");
            /*int opt = sc.nextInt();
             * }while(opt);
             */
        }while(sc.nextInt() == 1);  
        }
}

