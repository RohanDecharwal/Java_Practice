import java.util.*;

public class CollatzReverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while (z-- > 0) {
            int k = sc.nextInt();
            int x = sc.nextInt();
            for (int i = 0; i < k; i++) {
                if (i == k - 1 && (x - 1) % 3 == 0) {
                    int candidate = (x - 1) / 3;
                    if (candidate > 0 && candidate % 2 == 1) {
                        x = candidate;
                        continue;
                    }
                }
                x = x * 2;
            }
            System.out.println(x);
        }
        sc.close();
    }
}