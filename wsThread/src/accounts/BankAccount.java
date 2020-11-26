/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Harish Thadka
 */
public class BankAccount {

private double balance;
  private Lock balanceChangeLock;
  private Condition sufficientFundsCondition;
  
  /**
	* Constructor
	* Sets balance to 0.
	* Initializes balanceChangeLock to a new ReentrantLock.
	* Initializes sufficientFundsCondition using the newCondition
	* method for the ReentrantLock class.
	*/
  public BankAccount()
  {
	 setBalance(0);
	 balanceChangeLock = new ReentrantLock();
	 sufficientFundsCondition = balanceChangeLock.newCondition();
  }
  public double getBalance()
  {
	 return balance;
  }
  public void setBalance(double balance)
  {
	 this.balance = balance;
  }
  public void deposit(double amount)
  {
	 balanceChangeLock.lock();
	 try
	 {
		System.out.println("Depositing: " + amount);
		double newBalance = getBalance() + amount;
		System.out.println("New balance is " + newBalance);
		balance = newBalance;
		sufficientFundsCondition.signalAll();
	 }
	 finally
	 {
		balanceChangeLock.unlock();
	 }
  }
  public void withdraw(double amount) throws InterruptedException
  {
	 balanceChangeLock.lock();
	 try
	 {
		while(balance < amount)
		{
		  sufficientFundsCondition.await();
		}
		System.out.println("Withdrawing: " + amount);
		double newBalance = getBalance() - amount;
		System.out.println("New balance is " + newBalance);
		balance = newBalance;
	 }
	 finally
	 {
		balanceChangeLock.unlock();
	 }
  }

}
