import java.util.*;
public class functionoverloading {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        int result1 = sum(2, 3);
        int result2 =sum(2, 3, 4);

        System.out.println("Sum of 2 and 3 is: " + result1);
        System.out.println("Sum of 2, 3 and 4 is: " + result2);
    }
    
}
