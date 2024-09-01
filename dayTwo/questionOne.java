import java.util.Scanner;

public class questionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int num, ocount, ecount;
        ocount = ecount = 0;
        System.out.println("Enter number of elements: ");
        num = sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0) {
                ecount++;
            } else {
                ocount++;
            }
        }
        System.out.println("Number of even numbers: " + ecount);
        System.out.println("Number of odd numbers: " + ocount);
         

    }
}
