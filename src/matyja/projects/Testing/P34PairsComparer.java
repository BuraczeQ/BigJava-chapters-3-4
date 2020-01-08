package matyja.projects.Testing;

public class P34PairsComparer {

    public void pairComparer(double a, double b){
        double sum = a+b;
        double difference = a-b;
        double product = a*b;
        double avg = (a+b)/2;
        double distance = Math.abs(a-b);
      double larger = maximum(a,b);
      double smaller = minimum(a,b);

        System.out.println("Sum: "+ sum  + "\n Difference: " + difference
        + " \n Product: " + product + "\n Average: " + avg + "\n Distance between: " +distance
        + "\n Larger value: " + larger + " \n Smaller value: " + smaller);



    }

    double maximum(double a, double b){
        if(a>b){
            return a;
        }
        else return b;
    }
    double minimum(double a, double b){
        if(a<b){
            return a;
        }
        else return b;
    }

}
