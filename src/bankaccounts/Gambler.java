package bankaccounts;

public class Gambler extends Account{
    public Gambler(double balance) {
        super(balance);
    }
    public void withdraw(double amount){
        TotalTransactions++;
        double probability = Math.random();
        if (probability>=0.5)
            if (CurrentBalance - amount*2 >=0)
                CurrentBalance -= amount*2;
            else
                CurrentBalance = 0;
        System.out.println("probability: "+probability);
    }
}
