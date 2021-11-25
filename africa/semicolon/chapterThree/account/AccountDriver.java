package africa.semicolon.chapterThree.account;

public class AccountDriver {
    public static void main(String[] args) {
        Account myNewAccount = new Account("Adeola", 0.0);
//        myNewAccount.setAmountToCredit(50.0);
//        myNewAccount.withdraw(70.0);
//        double accountBalance = myNewAccount.getBalance();
//        System.out.println(accountBalance);
        displayAccount(myNewAccount);
    }
    public static void displayAccount(Account accountToDisplay){
        accountToDisplay.setAmountToCredit(50.0);

        accountToDisplay.withdraw(70.0);

        double accountBalance = accountToDisplay.getBalance();
        System.out.println(accountBalance);
        System.out.println(accountToDisplay.getName());

    }
}
