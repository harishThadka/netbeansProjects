/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Harish Thadka
 */
public class WithdrawRunnable implements Runnable {
    
    private static final int Delay = 10;
    private BankAccount account;
    private double amount;
    private int count;

    public WithdrawRunnable(BankAccount account, double amount, int count) {
        this.account = account;
        this.amount = amount;
        this.count = count;
    }

    @Override
    public void run() {

        for (int i = 1; i <= count; i++) {
            try {
                account.withdraw(amount);
                Thread.sleep(Delay);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
}
