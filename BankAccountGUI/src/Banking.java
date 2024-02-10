public class Banking {
    private double balance;

    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit (double amount){
        balance += amount;
    }
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){
        new BankGUI(new Banking());
    }

}

