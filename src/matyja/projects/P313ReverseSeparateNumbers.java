package matyja.projects;

public class P313ReverseSeparateNumbers {
    public void reconstruct(int number){
        String myNumber = String.valueOf(number);
        int length = myNumber.length();

        for(int i=0; i<length;i++){

            int reverse = length-i-1;
            System.out.println(myNumber.charAt(reverse));
        }




        System.out.println("Initial number is: " +myNumber);
      //  System.out.println(length);
    }
}
