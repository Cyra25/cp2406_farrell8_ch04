public class TestSandwichFilling {
    public static void main(String[] args){
        SandwichFilling sandwichFilling1 = new SandwichFilling("Salad",
                23);
        display(sandwichFilling1);
        SandwichFilling sandwichFilling2 = new SandwichFilling("Tomato",
                30);
        display(sandwichFilling2);
        SandwichFilling sandwichFilling3 = new SandwichFilling("Cucumber",
                37);
        display(sandwichFilling3);

    }

    public static void display(SandwichFilling swFilling){
        System.out.println("Filling is "+ swFilling.getFillingType());
        System.out.println("Calories = "+ swFilling.getFillingCalories());
    }
}
