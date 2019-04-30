import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        // Get numbers
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(),
        b = scan.nextInt();
        scan.close();
        // Now that we've found a and b, put them into function factors.
        // System.out.println(factors(a, b));
        int start = factors(a, b);
        if(start == -1) {
            for(int i = 1; i < (a < b ? a : b); i++) {
                int ans = factors(a + i, b + i);
                System.out.println(ans);
                if(ans != -1) {
                    System.out.println(i);
                    return;
                }
            }
        } else {
            System.out.println(0);
            return;
        }
    }
    public static int factors(int a, int b) {

        for(int i = 1; i < (a < b ? a : b); i++) {
            if(a % i == 0 && b % i == 0 && i != 1) {
                // Found it!
                return i;
            }
        }
        return -1;
    }
}