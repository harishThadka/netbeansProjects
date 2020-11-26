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
public class BankAccountThreadTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        // TODO code application logic here
        BankAccount account = new BankAccount();
        final double AMOUNT = 100;
        final int REPETITIONS = 10;
        
        DepositRunnable depRun = new DepositRunnable(account, AMOUNT, REPETITIONS);
        WithdrawRunnable withRun = new WithdrawRunnable(account, AMOUNT, REPETITIONS);
        
        Thread t1 = new Thread(depRun);
        Thread t2 = new Thread(withRun);
        t1.start();
        t2.start();
        
        
        
    }

}
