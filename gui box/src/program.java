public class program {
    public static void main(String [] args) {
        int result = factorial(5);  // calculates 5! = 5 * 4 * 3 * 2 * 1 = 120
        System.out.print(result);
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // base case
        } else {
            return n * factorial(n - 1);  // recursive case
        }
    }

}
