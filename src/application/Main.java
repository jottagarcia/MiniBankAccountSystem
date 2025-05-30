package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount Matthew = new BankAccount("Matthew ", 11,"CP");
        BankAccount Louise = new BankAccount("Louise", 12, "CC");

        Matthew.deposit(200.00);
        Matthew.withdraw(50.00);
        System.out.println(Matthew);

        System.out.println(Louise);
        Louise.bankSubscription();
        Louise.withdraw(38.00);
        Louise.closeAccount();
        System.out.println(Louise);


        sc.close();
    }
}
