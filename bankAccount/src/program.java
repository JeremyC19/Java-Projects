public class program {
    public static void main(String [] args) {
        while(true){
        CheckingAccount checkingAccount = new CheckingAccount("Todd", "Howard", 123456, 10000.00);
        checkingAccount.displayAccount();
        checkingAccount.deposit();
        checkingAccount.withdrawal();
        checkingAccount.getBalance();

        if(checkingAccount.balance < 0) {
            checkingAccount.proccessWithdrawal();
        }

        checkingAccount.displayAccount();

    }
        }
}
