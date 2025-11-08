/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;

/**
 *
 * @author WORKPLUS
 */
class Account {
    String accNo;
    double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.printf("Acc No: %s, Balance: Rp %,.2f\n", accNo, balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance); 
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.printf("-> Interest added to %s: Rp %,.2f\n", accNo, interest);
    }
}

class CheckingAccount extends Account {
    double overdraftLimit;

    public CheckingAccount(String accNo, double balance, double overdraftLimit) {
        super(accNo, balance); 
        this.overdraftLimit = overdraftLimit;
    }
}

public class LatihanBank {
    public static void main(String[] args) {
        Account[] accounts = new Account[4];
        accounts[0] = new SavingsAccount("S-101", 5000000, 0.05);
        accounts[1] = new CheckingAccount("C-201", 1000000, 500000);
        accounts[2] = new SavingsAccount("S-102", 10000000, 0.03);
        accounts[3] = new CheckingAccount("C-202", 200000, 0);

        System.out.println("--- Saldo Awal ---");
        for (Account acc : accounts) {
            acc.displayBalance();
        }

        System.out.println("\n--- Tambah Bunga (Interest) ---");
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) acc; 
                sa.addInterest();
            }
        }

        System.out.println("\n--- Saldo Akhir ---");
        for (Account acc : accounts) {
            acc.displayBalance();
        }
    }
}