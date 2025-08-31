package com.atmmachine;

public interface AtmOps {
    void checkBalance();
    void withdrawAmount(double amount);
    void depositAmount(double amount);

}
