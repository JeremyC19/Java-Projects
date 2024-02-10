public class CheckingAccount extends BankAccount{

    public CheckingAccount(String firstName, String lastName, int accountID, double balance) {
        super(firstName, lastName, accountID, balance);
    }

    public static double interestRate;
    public int overdraftFee = 30;

    public void proccessWithdrawal(){
            balance = balance - overdraftFee;
            System.out.println("A fee has been accessed");
    }

    public static void displayAccount(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }


}
