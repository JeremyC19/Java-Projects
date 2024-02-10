import java.util.Scanner;

public class BankAccount {
    public static String firstName;
    public static String lastName;
    public static int accountID;
    public static double balance;

    static Scanner scnr = new Scanner(System.in);

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
            this.accountID = accountID;
        }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void deposit(){
        System.out.println("Please enter deposit amount: ");
        balance = balance + scnr.nextDouble();
        System.out.println("Your updated balance is: " + balance);
    }

    public static void withdrawal(){
        System.out.println("Please enter withdrawal amount: ");
        balance = balance - scnr.nextDouble();
        System.out.println("Your updated balance is: " + balance);
    }

    public static void getBalance(){
        System.out.println("Your current balance is: " + balance);
    }

    public static void accountSummary(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(accountID);
        System.out.println(balance);
    }

    public BankAccount(String firstName, String lastName, int accountID, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = balance;
    }
}


