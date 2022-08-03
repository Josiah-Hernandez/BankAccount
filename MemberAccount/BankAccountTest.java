public class BankAccountTest{
    public static void main(String[] args){
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        BankAccount a3 = new BankAccount();

        System.out.println("Total Accounts: " + BankAccount.getMemberCount());
    }
}