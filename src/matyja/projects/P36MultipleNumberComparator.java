package matyja.projects;

public class P36MultipleNumberComparator {
    int smallest =0;
    int largest =0;
    int tracker =0;

    public void numberComparator(int i){
        if(tracker==0){
            largest=i;
            smallest=i;
            tracker++;
        }
        else {
            if(i>largest){
                largest=i;
            }
            if (i<smallest){
                smallest=i;
            }
        }

    }

    public void printResults(){
        System.out.println("Largest number entered was: " + largest+
        "\n Smallest number entered was: " + smallest);
    }


}
