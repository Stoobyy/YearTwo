import java.util.Scanner;

public class questionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();
        
        int digitCount = 0;
        int alphabetCount = 0;
        int specialSymbolCount = 0;
        
        for (char c : paragraph.toCharArray()) {
            if (c >= 48 && c <= 57) digitCount++;
            else if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) alphabetCount++;
            else specialSymbolCount++;
        }
        
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of alphabets: " + alphabetCount);
        System.out.println("Number of special symbols: " + specialSymbolCount);
        
        scanner.close();
    }
}