package matyja.projects;

public class P31CashRegistry {
    private double purchaseQuote = 0;
   private double balance =0;
   private int itemsBought =0;


    public void recordPurchase(double quote){
        purchaseQuote+=quote;
        itemsBought++;
    }

    public void enterDollar(int dollars){
        balance+=dollars;
    }

    public void enterQuarter(int quarters){
        double quarter = (double) quarters;
        double dollarsFromQuaters =  (quarter/4);
        balance+=dollarsFromQuaters;
    }
    public void enterDimes(int dimes){
        double dime = (double) dimes;
        double dollarsFromDimes = dime/10;
        balance+=dollarsFromDimes;
    }
    public void enterNickles(int nickles){
        double nickel = (double) nickles;
        double dollarsFromNickles = nickel/20;
        balance+=dollarsFromNickles;
    }
    public void enterPennies(int pennies){
        double penny = (double) pennies;
        double dollarsFromPennies = penny/100;
        balance+=dollarsFromPennies;
    }
    public void balanceInformer() {
        System.out.println("Your balance is " + balance);
    }

    public void changeTeller(){
        double change = balance-purchaseQuote;
        change = change*100;
        change = Math.round(change);
        change = change/100;
        System.out.println("Your change will be " + change + " You useless piece of shit.");
        System.out.println("You bought " + itemsBought +" items in our shop.");

        //To reset items bought for a customer
        itemsBought=0;
    }


}
