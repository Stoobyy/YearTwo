import java.io.*;

public class Encrypt {
    public static void main(String args[]) throws IOException {
        String inputFile = "message.txt";
        String outputFile = "encrypted.txt";
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);
            int c;
            while((c = reader.read()) != -1)
            {
                char e = (char)(c+2);
                writer.write(e); 
            }
            reader.close();
            writer.close();
            System.out.println("Encrypted message is written to encrypted.txt");
    }
}
