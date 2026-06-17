
public class ArraysCC3 {
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            if(Largest < numbers[i]){
                Largest = numbers[i];
            }
        }
        return Largest;

    }

    public static void main(String[] args){
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20};
        int num = getLargest(numbers);
        System.out.println("Largest number is: " + num);
    }
}
