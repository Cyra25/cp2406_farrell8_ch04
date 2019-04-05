public class Bread {
    String breadType;
    double calories;
    public final static String MOTTO= "The stuff of life";

    public Bread(String bt, double cal){
        breadType = bt;
        calories = cal;
    }

    public void setBreadType(String bt){
        this.breadType = bt;
    }

    public void setCalories(double cal) {
        this.calories = cal;
    }

    public String getBreadType(){
        return breadType;
    }

    public double getCalories() {
        return calories;
    }
}
