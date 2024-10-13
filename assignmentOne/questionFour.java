/* Write a Java program to read a number from a file and check whether it is a
palindrome number. If the number is a palindrome number, copy the number into an
output file otherwise copy the text "The number is not palindrome" into the output
file.Handle all file related exceptions. */

import java.io.*;
import java.util.*;

public class questionFour{
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            File outputFile = new File("output.txt");
            Scanner sc = new Scanner(inputFile);
            FileWriter fw = new FileWriter(outputFile);
            int number = sc.nextInt();
            int rev = 0;
            int temp = number;
            while(temp != 0){
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }
            if(rev == number) fw.write(Integer.toString(number));
            else fw.write("The number is not palindrome");
            sc.close();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}