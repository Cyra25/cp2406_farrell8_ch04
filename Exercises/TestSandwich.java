public class TestSandwich {
    public static void main(String[] args){
        Sandwich sandwich1 = new Sandwich("Plain", 23, "Tomato", 21);
        display(sandwich1);

        Sandwich sandwich2 = new Sandwich("Brown", 10, "Cucumber", 18);
        display(sandwich2);
        Sandwich sandwich3 = new Sandwich("White", 30, "Hum", 35);
        display(sandwich3);
    }
    public static void display(Sandwich sw){
        System.out.println(sw.bread.getBreadType()+ "\n"+ sw.sandwichFilling.getFillingType()+
                "\n" + sw.calulateCal());
    }
}
