import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value: ");
        int a = sc.nextInt();
        sc.close();
        
        for(int i = 0; i < a; i++) {
            System.out.print(2 * i + 1);
            if(i != a - 1)
            {
                System.out.print(",");
            }
        }
    }
}
