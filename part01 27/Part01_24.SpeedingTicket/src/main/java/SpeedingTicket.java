
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        int speed_limit = 120;
        if (speed > speed_limit) {
            System.out.println("Speeding ticket!");
        }
    }
}
