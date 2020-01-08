package matyja.projects;

import java.util.Scanner;

public class P48IncomeTaxCalcUS {
    private Scanner scanner = new Scanner(System.in);

    public void taxCalc(){
        double remaining = 0;
        double tax =0;

        System.out.println("Enter the amount of money that u  earned last year : ");

        double amount = scanner.nextDouble();
        scanner.nextLine();

        if(amount>500000){
            remaining = amount-500000;
            tax += 0.06*remaining;
            amount=amount-remaining;
        }

        System.out.println("Tax so far... " + tax);
        if (amount<=500000&& amount>250000){
            remaining = amount-250000;
            tax += 0.05*remaining;
            amount=amount-remaining;
        }
        System.out.println("Tax so far... " + tax);
        if (amount<=250000&& amount>100000){
            remaining = amount-100000;
            tax += 0.04*remaining;
            amount=amount-remaining;
        }
        System.out.println("Tax so far... " + tax);
        if (amount<=100000&& amount>75000){
            remaining = amount-75000;
            tax += 0.03*remaining;
            amount=amount-remaining;
        }
        System.out.println("Tax so far... " + tax);
        if (amount<=75000&& amount>50000){
            remaining = amount-50000;
            tax += 0.02*remaining;
            amount=amount-remaining;
        }
        System.out.println("Tax so far... " + tax);
        if (amount<=50000){
            remaining = amount;
            tax += 0.01*remaining;
            amount=amount-remaining;
        }
        System.out.println("Total tax... " + tax);




    }
}
