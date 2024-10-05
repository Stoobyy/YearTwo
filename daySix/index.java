import java.io.*;
import java.util.*;

class ATM {
    private String accountNumber;
    private int balance;

    public ATM(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        String filename = accountNumber + ".txt";
        File file = new File(filename);
        Scanner scanner  = null;
        PrintWriter writer = null;
        try{
            if(file.exists()) {
                scanner = new Scanner(file);
                this.balance = scanner.nextInt();
                scanner.close();
            } else {
                writer = new PrintWriter(file);
                writer.println(balance);
                writer.close();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
        finally{
            System.out.println("Current balance: " + balance);
            if(scanner != null) {
                scanner.close();
            }
            if(writer != null) {
                writer.close();
            }
        }
    }

    public int balanceEnquiry() {
        return balance;
    }

    public void withdraw(int amount){
        balance = balanceEnquiry();
        String filename = accountNumber + ".txt";
        PrintWriter writer = null;
        try{
            if(amount > balance) {
                throw new insufficientBalance("Insufficient balance");
            }
            writer = new PrintWriter(filename);
            balance -= amount;
            writer.println(balance);
            System.out.println("Withdrawal successful");
        }
        catch(insufficientBalance e) {
            System.out.println("Error: " + e);
        }
        catch(IOException e) {
            System.out.println("Error: " + e);

        }
        finally{
            System.out.println("Current balance: " + balance);
            if(writer != null) writer.close();
        }
        
    }

    public void deposit(int amount) {
        balance = balanceEnquiry();
        PrintWriter writer = null;
        try{
            balance = balanceEnquiry();
            balance += amount;
            String filename = accountNumber + ".txt";
            writer = new PrintWriter(filename);
            writer.println(balance);
            writer.close();
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
        finally{
            System.out.println("Current balance: " + balance);
            if(writer != null) writer.close();
        }
    }

    public void transfer(String accountNumber, int amount) {
        balance = balanceEnquiry();
        String filename = accountNumber + ".txt";
        File file = new File(filename);
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(filename);
            if(file.exists()) {
                if(amount > balance) {
                    throw new insufficientBalance("Insufficient balance");
                }
                writer.println(amount);
                writer.close();
                withdraw(amount);
                System.out.println("Transfer to Ac.NO"+ accountNumber + "successful");
            } else {
                System.out.println("Account number does not exist");
            }
        }
        catch(insufficientBalance e) {
            System.out.println("Error: " + e);
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
        finally{
            System.out.println("Current balance: " + balance);
            if(writer != null) writer.close();
        }
    }

}

class insufficientBalance extends Exception {
    public insufficientBalance(String message) {
        super(message);
    }
}

class index {
    public static void main(String[] args){
        ATM atm = new ATM("1234567890", 1000);
        ATM atm2 = new ATM("0987654321", 500);
        atm.withdraw(500);
        atm.deposit(1000);
        atm.transfer("0987654321", 500);
    }    
}