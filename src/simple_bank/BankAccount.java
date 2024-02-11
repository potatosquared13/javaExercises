package simple_bank;
import java.util.Random;

public class BankAccount {
    private String name, accountNumber;
    private double balance = 0;

    public BankAccount() { }

    public void createAccount(String name) {
        this.name = name;
        System.out.println("Account created with name: " + name);

        //Generate account number
        generateAccountNumber();
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public void depositAmount(double amount) {
        this.balance += amount;
        System.out.printf("Balance for account %s: %.2f\n", this.accountNumber, this.balance);
    }

    public void withdrawAmount(double amount) {
        if(this.balance - amount < 0) {
            System.out.println("Balance is not enough! Enter amount again!");
        } else {
            this.balance -= amount;
            System.out.printf("Balance for account %s: %.2f\n", this.accountNumber, this.balance);
        }
    }
    private void generateAccountNumber() {
        Random rand = new Random();
        String card = "PO";

        for(int i = 0; i < 10; i++) {
            int random_number = rand.nextInt(10); //generate random number 1-9

            //add after PO
            card += Integer.toString(random_number);
        }

        this.accountNumber = card;
    }
}
