package bankaccounts;

abstract public class Account {
    public double CurrentBalance;
    public double TotalTransactions;
    public Account(double balance){
        this.CurrentBalance = balance;
        this.TotalTransactions = 0;
    }
    //public void charge(){};
    final void deposit(double amount){
        TotalTransactions ++;
        CurrentBalance += amount;
    }
    public void withdraw(double amount){
        TotalTransactions++;
        if (CurrentBalance-amount>=0)
            CurrentBalance -= amount;
        else
            CurrentBalance = 0;
    }
    public void endMonth(){
        System.out.println("Total of Transactions: "+TotalTransactions);
        System.out.println("Current balance: "+CurrentBalance);
        TotalTransactions = 0;
    }
}
