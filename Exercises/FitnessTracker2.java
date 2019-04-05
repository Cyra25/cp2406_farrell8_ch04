import java.time.LocalDate;

public class FitnessTracker2 {
    String activity;
    LocalDate date;
    int minutes;

    public FitnessTracker2(){
        this("Cycling", 300, LocalDate.of(2019,4,24));
    }

    public FitnessTracker2(String a, int m, LocalDate d){
        //for exercise 3b
        activity= a;
        minutes = m;
        date = d;
    }

    public String getActivity(){

        return activity;
    }
    public int getMinutes(){

        return minutes;
    }
    public LocalDate getDate(){

        return date;
    }

}
