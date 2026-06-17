import java.util.*;
public class dectobinonemore {
    public static int dectobin(int decnum){
        int binnum = 0;
        int pow = 0;
        while(decnum > 0){
            int rem = decnum % 2;
            binnum = binnum + rem * (int)Math.pow(10, pow);
            pow++;
            decnum = decnum/2;
        }
        return binnum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decnum = sc.nextInt();
        int binnum = dectobin(decnum);
        System.out.println("The binary number is ; " + binnum);
        sc.close();
    }
}
