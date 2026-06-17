import java.util.*;
public class bintodeconemore {
    public static int BinToDec(int BinNum){
        int DecNum = 0;
        int pow = 0;
        while(BinNum > 0){
            int LastDigit = BinNum % 10;

            if(LastDigit != 0 && LastDigit != 1){
                System.out.println("Error: " + BinNum + " is not a valid binary number." );
                return -1;
            }

            DecNum = DecNum + (LastDigit * (int)Math.pow(2, pow));
            pow++;
            BinNum = BinNum /10;
        }
        return DecNum; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int BinNum = sc.nextInt();
        int DecNum = BinToDec(BinNum);
        System.out.println("Decimal of " + BinNum + " is: " + DecNum);
        sc.close();
    }
}
