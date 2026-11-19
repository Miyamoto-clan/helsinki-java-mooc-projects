import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bracket0 = 5000;
        double bracket1 = 25000;
        double bracket2 = 55000;
        double bracket3 = 200000;
        double bracket4 = 1000000;
        double limit0 = 100;
        double limit1 = 1700;
        double limit2 = 4700;
        double limit3 = 22100;
        double limit4 = 142100;
        double tax1 = .08;
        double tax2 = .10;
        double tax3 = .12;
        double tax4 = .15;
        double tax5 = .17;

        System.out.println("Value of the gift?");
        double gift = Double.valueOf(scan.nextLine());
        if (gift < bracket0) {
            System.out.println("No tax!");
        } else if (gift >= bracket0 && gift < bracket1) {
            double tax = (((gift - bracket0) * tax1) + limit0);
            System.out.println("Tax: " + tax);
        } else if (gift >= bracket1 && gift < bracket2) {
            double tax = (((gift - bracket1) * tax2) + limit1);
            System.out.println("Tax: " + tax);
        } else if (gift >= bracket2 && gift < bracket3) {
            double tax = (((gift - bracket2) * tax3) + limit2);
            System.out.println("Tax: " + tax);
        } else if (gift >= bracket3 && gift < bracket4) {
            double tax = (((gift - bracket3) * tax4) + limit3);
            System.out.println("Tax: " + tax);
        } else if (gift >= bracket4) {
            double tax = (((gift - bracket4) * tax5) + limit4);
            System.out.println("Tax: " + tax);
        }

    }
}
