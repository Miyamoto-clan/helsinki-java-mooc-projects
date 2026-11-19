import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Write your program here
        int orwellDate = 1984;
        System.out.println("Give a number:");
        int date = Integer.valueOf(scan.nextLine());
        if (date == orwellDate) {
            System.out.println("Orwell");
        }
    }
}