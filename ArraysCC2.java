import java.util.*;

public class ArraysCC2 {
    public static int linearSearch(int numbers[], int key){

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key you want to find: ");
        int index = sc.nextInt();

        int UserNum = linearSearch(numbers, index);
        if(UserNum==-1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("Key is at index: " + UserNum);
        }
    }   
}