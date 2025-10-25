import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value: ");
        int a = sc.nextInt();
        sc.close();
        int n = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < n; i++) {
            System.out.print((2 * i + 1));
            if (i != n - 1)
             {
              System.out.print(", ");
             }
    }
}
}
