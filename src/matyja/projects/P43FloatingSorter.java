package matyja.projects;

import java.util.Scanner;

public class P43FloatingSorter {


   private Scanner scanner = new Scanner(System.in);

public void floatingPointSorter(){
    double flag = 0;

    System.out.println("Enter 3 floating points, SEPARATE YOUR INPUT WITH COMA NOT WITH A DOT!!!  ");
    System.out.println("First one : ");
    double first = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Second one: ");
    double second = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Third one: ");
    double third = scanner.nextDouble();
    scanner.nextLine();

    if(first>=second){
        flag = first;
        first = second;
        second=flag;
        flag =0;
    }
    if (second>=third){
        flag=second;
        second=third;
        third=flag;
        flag=0;
    }
    if(first>=second){
        flag = first;
        first = second;
        second=flag;
        flag =0;}

    System.out.println("Your entered numbers sorted: \n" + first + "\n"+ second+ "\n" +third);



}

}
