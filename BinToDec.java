import java.util.*;

public class BinToDec {

    public static void bintodec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;

            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Error: " + myNum + " is not a valid binary number.");
                return;
            }

            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;

            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + myNum + " is: " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();

        bintodec(binNum);

        sc.close();
    }
}