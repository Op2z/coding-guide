import java.util.Scanner;

public class XOClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        XO(sc.nextInt());
    }

    private static void XO(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                if (i == j) System.out.print("X");
                else if (i + j == n + 1) System.out.print("X");
                else System.out.print("O");

            }
            System.out.println();
        }
    }
}


