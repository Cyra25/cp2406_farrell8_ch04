public class Sandwich {
    double totalCalories;
    public SandwichFilling sandwichFilling;
    public Bread bread;

    public Sandwich(String breadType, double calories, String fillingType, double fillingCalories){
        this.bread = new Bread(breadType, calories);
        this.sandwichFilling = new SandwichFilling(fillingType, fillingCalories);
    }
    public double calulateCal(){
        totalCalories = (2* bread.getCalories()) + sandwichFilling.getFillingCalories();
        return totalCalories;
    }


}
