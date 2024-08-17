import java.util.Scanner;
public class questionTwo {
    public static void main(String[] args) {
        int[][] mat1 = new int[5][5];
        int[][] mat2 = new int[5][5];
        int[][] result = new int[5][5];
        int[][] transposed = new int[5][5];
        Scanner sc = new Scanner(System.in);
        int a1,b1,a2,b2;
        System.out.println("Enter number of rows and columns for matrix 1: ");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        System.out.println("Enter number of rows and columns for matrix 2: ");
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        if(a1 != a2 || b1 != b2) {
            System.out.println("Matrices are not of same size");
            return;
        }
        System.out.println("Enter elements for matrix 1: ");
        for(int i = 0; i < a1; i++) {
            for(int j = 0; j < b1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for matrix 2: ");
        for(int i = 0; i < a2; i++) {
            for(int j = 0; j < b2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < a1; i++) {
            for(int j = 0; j < b1; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Resultant matrix: ");
        for(int i = 0; i < a1; i++) {
            for(int j = 0; j < b1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i<a1; i++) {
            for(int j = 0; j<b1; j++) {
                transposed[j][i] = result[i][j];
            }
        }
        System.out.println("Transposed matrix: ");
        for(int i = 0; i < b1; i++) {
            for(int j = 0; j < a1; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
