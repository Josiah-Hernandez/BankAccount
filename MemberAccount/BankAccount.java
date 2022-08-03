public class BankAccount{
    //attributes - should always be private
    private double checking;
    private double savings;
    private double checkingBalance;
    private double savingsBalance;
    private static double totalMoney;
    private static int memberCount; //belongs to class



    //constructors
    public BankAccount(){
        memberCount++; //no "this" for static variables
    }


    //getters & setters methods
    public double getChecking(){
        return this.checking;
    }

    public double getSavings(){
        return this.savings;
    }

    public double getTotalMoney(){
        return totalMoney;
    }
    
    public static int getMemberCount(){
        return memberCount;
    }


    //customized methods
    public void depositChecking(double depositedChecking){
        this.checking += checking;
        depositedChecking += checkingBalance;
    }
    
    public void withdrawalChecking(double withdrewChecking){
        this.checking -= checking;
        withdrewChecking -= checkingBalance;
    }
}