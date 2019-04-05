import java.util.Scanner;

public class Billing {
    final static double TAX = 0.08;

    public static void main(String[] args){
        double totalDue;
        totalDue = computeBill(34.5);
        System.out.println("Total due is "+ totalDue);
        totalDue = computeBill(34.5,6);
        System.out.println("Total due is "+ totalDue);
        totalDue = computeBill(34.5, 6, 3.5);
        System.out.println("Total due is "+ totalDue);

    }
    public static double computeBill(double pricePerBook){
        double totalDue = pricePerBook +(pricePerBook*8/100);
        return totalDue;
    }
    public static double computeBill(double pricePerBook, int quantity){
        double totalDue = (pricePerBook * quantity) +((pricePerBook * quantity) * TAX);
        return totalDue;
    }
    public static double computeBill(double pricePerBook, int quantity, double couponValue){
        double totalDue = ((pricePerBook * quantity) - couponValue) + (((pricePerBook * quantity) - couponValue)*TAX);
        return totalDue;
    }
}
