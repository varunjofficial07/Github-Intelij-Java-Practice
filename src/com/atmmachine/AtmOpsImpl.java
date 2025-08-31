package com.atmmachine;
import java.util.Scanner;
public class AtmOpsImpl implements  AtmOps{
    double amount;
    Scanner sc = new Scanner(System.in);
    Atm user = new Atm();
    @Override
    public void checkBalance() {
        System.out.println("Available balance is: " + user.getCheckBalance());
    }
    @Override
    public void withdrawAmount(double amount) {
        System.out.println(amount + " Withdraw successfully");
        user.setCheckBalance(user.getCheckBalance() - amount);
        System.out.println("Current Balance: "+user.getCheckBalance());
    }
    @Override
    public void depositAmount(double amount) {
        System.out.println(amount + " Deposited Successfully.");
        user.setCheckBalance(amount + user.getCheckBalance());
        System.out.println("Current Balance: "+ user.getCheckBalance());
    }
}
