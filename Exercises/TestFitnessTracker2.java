import java.time.LocalDate;

public class TestFitnessTracker2 {
    public static void main(String[] args){
        FitnessTracker2 fitnessTracker1 = new FitnessTracker2();

        //test the default outputs of the FitnessTracker
        System.out.println(fitnessTracker1.getActivity() + "\n"+
                fitnessTracker1.getMinutes() + "\n" +
                fitnessTracker1.getDate());

        LocalDate date = LocalDate.of(2018,4,3);
        FitnessTracker2 fitnessTracker2 = new FitnessTracker2("Swimming", 120, date);
        //test the output when the inputs are given
        System.out.println(fitnessTracker2.getActivity() + "\n"+
                fitnessTracker2.getMinutes() + "\n" +
                fitnessTracker2.getDate());

    }
}
