package bank;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    private int nextAccountNumber = 103;

    public Bank() {
        // Preload 3 accounts
        accounts.add(new Account(100, "susendran", 10000));
        accounts.add(new Account(101, "jeeva", 20000));
        accounts.add(new Account(102, "satheesh", 123213));
    }

    public Account findAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    public Account createAccount(String name, double amount) {
        nextAccountNumber++;
        Account newAcc = new Account(nextAccountNumber, name, amount);
        accounts.add(newAcc);
        return newAcc;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to SK Bank");
        System.out.print("Enter your account number: ");
        int inputAccountNumber = sc.nextInt();

        Account currentAccount = bank.findAccount(inputAccountNumber);

        if (currentAccount == null) {
            System.out.println("Account not found.");
            System.out.println("Do you want to open a new account? Enter 1 for Yes or 0 for No:");
            int choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine(); // clear buffer
                System.out.print("Enter your name: ");
                String name = sc.nextLine();
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                currentAccount = bank.createAccount(name, amount);
                System.out.println("Account created successfully! Your account number is: " + currentAccount.getAccountNumber());
            } else {
                System.out.println("Thank you for visiting SK Bank.");
                return;
            }
        }

        int option;
        do {
            System.out.println("\nWelcome " + currentAccount.getName());
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    currentAccount.deposit(depositAmount);
                    System.out.println("Amount deposited successfully.");
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (currentAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.println("Account Holder: " + currentAccount.getName());
                    System.out.println("Current Balance: " + currentAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for banking with SK Bank!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 4);

        sc.close();
    }
}
