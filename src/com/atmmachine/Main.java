package com.atmmachine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AtmOpsImpl op = new AtmOpsImpl();
        Scanner sc = new Scanner(System.in);
        int atmNumberUser = 1234;
        int atmPinNumber= 123;
        System.out.println("Enter the atm Number: ");
        int atmNumber = sc.nextInt();
        System.out.println("Enter the pin Number: ");
        int atmPin = sc.nextInt();
        if(atmNumber == atmNumberUser && atmPin == atmPinNumber){
            while (true){
                System.out.println("**********  Welcome banking  ********** \n 1.Check Balance \n 2.Deposit Amount \n 3.Withdraw Amount \n 4.Exit app.");
                System.out.println("Enter the choice: ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Account balance");
                        op.checkBalance();
                        break;
                    case 2:
                        System.out.println("Deposit amount");
                        System.out.print("Enter the amount to deposit: ");
                        int depositAmount = sc.nextInt();
                        op.depositAmount(depositAmount);
                        break;
                    case 3:
                        System.out.println("Withdraw amount");
                        System.out.println("Enter amount to withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        op.withdrawAmount(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Thank you Banking");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter the valid choice");
                }
            }
        }
        else {
            System.out.println("Enter the valid pin");
        }
    }
}
