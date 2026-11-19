import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Write your program here
        int date = 2015;
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        if (year < date) {
            System.out.println("Ancient history!");
        }
    }
}
