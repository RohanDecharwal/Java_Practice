import java.util.*;

public class CollatzReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        int z = s.nextInt();        
        while (z-- > 0) {
            int k = s.nextInt();
            int x = s.nextInt();            
            for (int i = 0; i < k; i++) {
                if ((x - 1) % 3 == 0) {
                    int candidate = (x - 1) / 3;
                    if (candidate % 2 == 1) {
                        x = candidate;
                        continue;
                    }
                }
                x *= 2;
            }            
            System.out.println(x);
        }
        s.close();
    }
}