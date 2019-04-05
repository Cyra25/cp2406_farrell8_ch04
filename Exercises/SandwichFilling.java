public class SandwichFilling {
    String fillingType;
    double fillingCalories;

    public SandwichFilling(String filling, double cal){
        fillingType = filling;
        fillingCalories = cal;
    }

    public void setFillingType(String filling){
        this.fillingType = filling;
    }
    public String getFillingType(){
        return fillingType;
    }

    public void setFillingCalories(double cal) {
        this.fillingCalories = cal;
    }

    public double getFillingCalories() {
        return fillingCalories;
    }
}
