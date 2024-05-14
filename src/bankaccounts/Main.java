package bankaccounts;

public class Main {
    public static void main(String[] args){
        System.out.println("example of Fee Account");
        Account feeAcc = new Fee(100);
        feeAcc.deposit(200);    // 100 + 200 = 300
        feeAcc.withdraw(10);    // 300 - 10 = 290
        feeAcc.endMonth();  // 290 - 5 = 285
        System.out.println("example of NickleNDime Account");
        Account NickAcc = new NickleNDime(50);
        NickAcc.deposit(300);   // 50 + 300 = 350
        NickAcc.withdraw(20);   // 350 - 20 - 0.5 = 329.5
        NickAcc.withdraw(100);  // 329.5 - 100 - 0.5 = 229
        NickAcc.endMonth();
        System.out.println("example of Gambler Account");
        Account gamblerAcc = new Gambler(100);
        gamblerAcc.deposit(200);
        gamblerAcc.withdraw(100);
        gamblerAcc.deposit(50);
        gamblerAcc.withdraw(30);
        gamblerAcc.endMonth();
    }
}
