
public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        // %5d = right-aligned in a field of width 5
        System.out.printf("%.5f\n", 42.0);   // "   42" (3 spaces + 42)
        System.out.printf("%.5f\n", 1234.); // " 1234" (1 space + 1234)

// %-5d = left-aligned
        System.out.printf("%-5d\n", 42);  // "42   "

    }
}
