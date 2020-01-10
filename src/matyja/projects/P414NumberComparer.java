package matyja.projects;

import java.util.Scanner;

public class P414NumberComparer {
    private Scanner scanner = new Scanner(System.in);

    public void numberComparator(){
        System.out.println("Hi we are going to compare 2 doubles for you. Please enter a 1st double....");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter a second double... ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        number1 = (double) Math.round(number1*100)/100;
        number2 = (double) Math.round(number2*100)/100;

        System.out.println(number1);
        System.out.println(number2);
        if(number1==number2){
            System.out.println("Difference is less than 0.01");
            System.out.println("Numbers are equal to 2 decimal points.......");
        }else {
            System.out.println("Difference is more than 0.01");
            System.out.println("Numbers are not equal up to 2 decimal places..");
        }



        scanner.close();



    }

}
