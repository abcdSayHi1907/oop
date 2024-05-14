package bankaccounts;

public class NickleNDime extends Account{
    public NickleNDime(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        TotalTransactions++;
        if (CurrentBalance - amount - 0.5 >= 0)
            CurrentBalance = CurrentBalance - amount - 0.5;
        else
            CurrentBalance = 0;
    }
}
