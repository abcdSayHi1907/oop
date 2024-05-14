package bankaccounts;

public class Fee extends Account{
    public double CHARGE = 5;

    public Fee(double balance) {
        super(balance);
    }

    @Override
    public void endMonth() {
        CurrentBalance -= CHARGE;
        System.out.println("Total of Transactions: "+TotalTransactions);
        System.out.println("Current balance: "+CurrentBalance);
        TotalTransactions = 0;
    }
}
