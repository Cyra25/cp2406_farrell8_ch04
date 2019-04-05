public class TestBread {
    public static void main(String[] args) {
        Bread bread1 = new Bread("Rasberry", 34);
        display(bread1);
        Bread bread2 = new Bread("BlueBerry", 12);
        display(bread2);
        Bread bread3 = new Bread("YellowBerry", 27);
        display(bread3);

    }

    public static void display(Bread b){
        System.out.println("bread type - "+ b.getBreadType());
        System.out.println("Calories - " + b.getCalories());
        System.out.println(Bread.MOTTO);
    }
}
