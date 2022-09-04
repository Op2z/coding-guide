import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        long expectedTotal = (long)(((double)n/2)*((double)n+1));
        for (int i = 0; i < n-1; i++){
            total += sc.nextInt();
        }
        /*for (int j = 1; j <= n; j++ ){
            expectedTotal += j;
        }*/
        System.out.println(expectedTotal - total);
    }
}
