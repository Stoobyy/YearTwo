import java.io.*;
import java.util.Scanner;
public class Prime {
    public static void main(String[]args) {
        String inputFile = "numbers.txt";
        String outputFile = "prime.txt";
        try{
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);
            Scanner scanner = new Scanner(reader);
            while(scanner.hasNextInt()) {
                int num = scanner.nextInt();
                int i,flag=0;
                for(i=2; i <= (num/2); i++) {
                    if(num%i == 0) {
                        flag=1;
                        break;
                    }
                }
                if(flag == 0) {
                    writer.write(num+"\n");
                }
            }
            reader.close();
            writer.close();

            System.out.println("Prime numbers are written to prime.txt");
        }
        catch(IOException e) {
                System.out.println("An error occurred.");
            }
    }
}
