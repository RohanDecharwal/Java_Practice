public class ArraysCC4 {

    public static int BinarySearch(int Numbers[], int key){
        int start = 0, end = Numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(Numbers[mid] == key){
                return mid;}

            if(Numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            }
            
            return -1;
        }
    public static void main(String[] args){
        int Numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 3;

        System.out.println("Key is at index: " + BinarySearch(Numbers, key));
    }
}