import java.util.*;
public class arrays{

    public static int linearSearch(int numbers[], int key){

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key to find index: ");
        int key = sc.nextInt();
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int index = linearSearch(numbers, key);
        if(index==-1){
            System.out.println("Error: enter a valid key!");
        }else{
            System.out.println("The key is at index: " + index);
        }
    }
}