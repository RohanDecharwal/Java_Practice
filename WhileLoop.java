import java.util.*;

public class WhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = sc.nextInt();

        int n = 1;

        while(n<=range){
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
    }
}