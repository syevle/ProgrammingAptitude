package forTest;

public class Sum2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;
        // for loop
        for (int i = n; i >= 1; --i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }
}
