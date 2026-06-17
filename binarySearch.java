import java.util.*;

public class binarySearch{

    public static int BinarySearch(int numbers[], int key){
        
        int start = 0;
        int end = numbers.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        System.out.println("Enter a valid number which is in the list."); 
        return -1;
    }
    public static void main(String args[]){
        
        int numbers[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key: ");
        int key = sc.nextInt();

        System.out.println("The key is at index: " + BinarySearch(numbers, key));
    }
}