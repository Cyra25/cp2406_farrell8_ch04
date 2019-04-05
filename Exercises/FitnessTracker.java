import java.time.LocalDate;

public class FitnessTracker {
    String activity;
    LocalDate date;
    int minutes;

    public FitnessTracker(){
        activity = "running";
        minutes = 0;
        date = LocalDate.of(2019,01,01);
    }

    public FitnessTracker(String a, int m, LocalDate d){
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
