package simple_bank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * @return
 */

//FIXME
public class BankAccount {
    private static final int ACCOUNT_LENGTH = 10;
    private final String name;
    private final String accountNumber;
    private BigDecimal balance = new BigDecimal("0.00");

    public BankAccount(String name) {
        this.name = name;
        System.out.println("Account created with name: " + name);

        //TODO: Set account number
        this.accountNumber = generateAccountNumber();
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public void testDivision() {
        this.balance = this.balance.divide(new BigDecimal("3"), RoundingMode.FLOOR);
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void depositAmount(double amount) {
        this.balance = this.balance.add(new BigDecimal(amount));
        System.out.printf("Balance for account %s: %.2f\n", this.accountNumber, this.balance);
    }

    public void withdrawAmount(double amount) {
        if (this.balance.subtract(new BigDecimal(amount)).compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Balance is not enough! Enter amount again!");
        } else {
            this.balance = this.balance.subtract(new BigDecimal(amount));
            System.out.printf("Balance for account %s: %.2f\n", this.accountNumber, this.balance);
        }
    }

    private String generateAccountNumber() {
        Random rand = new Random();
        StringBuilder accountNumber = new StringBuilder("PO");

        for (int i = 0; i < ACCOUNT_LENGTH; i++) {
            int random_number = rand.nextInt(10); //generate random number 0-9

            //add after PO
            accountNumber.append(random_number);
        }

        return accountNumber.toString();
    }
}
