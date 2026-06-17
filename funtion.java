import java.util.*;
public class funtion {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter a value of b: ");
        int b = sc.nextInt();
        int product = multiply(a, b);
        System.out.println("The product of a and b is " + product);
    }
}
