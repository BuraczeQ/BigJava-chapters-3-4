package matyja.projects.Testing;

public class P315MilitaryClockTeller {

    public void howManyHours(int startClock, int endClock){

        int sMinutes = startClock%100;
        int sHours = (startClock - sMinutes)/100;

        int eMinutes = endClock%100;
        int eHours = (endClock - eMinutes)/100;

        if(sMinutes<=60 & sHours<=24 & eMinutes<=60 &eHours<=24){
            int hSpent = eHours-sHours;
            int mSpent = eMinutes-sMinutes;

            System.out.println("The task will take " + hSpent + "hours, and " + mSpent + " minutes");

        }else {
            System.out.println("PLEASE ENTER VALID DATA IN MILITARY FORMAT -> HHMM , HHMM");
        }







      //  System.out.println("Number of hours " + sHours + "\nNumber of minutes " + sMinutes);
    }

}
