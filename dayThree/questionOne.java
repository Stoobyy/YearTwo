
class bankAccount {
    private int accountNumber;
    private String accountName;
    private int balance;

    bankAccount(int accountNumber, String accountName, int balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public bankAccount(int accountNumber, String accountName) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if(balance < amount) System.out.println("Insufficient balance");
        else balance -= amount;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void details() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + balance);
    }
}

class questionOne {
    public static void main(String[] args) {
        bankAccount accountOne = new bankAccount(1234, "Amrith", 5000);
        bankAccount accountTwo = new bankAccount(5678, "Abhinav"); //Zero Balance Account

        

    }
}