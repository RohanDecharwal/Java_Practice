public class ArraysCC7 {

    public static void SubArrays(int numbers[]){

        int totalsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;

            for(int j=i; j<numbers.length; j++){
                int end = j;

                int sum = 0;

                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum += numbers[k];
                }
                
                System.out.println("Sum = " + sum);

                totalsum += sum;

                if(sum>maxsum){
                    maxsum = sum;
                }
                if(sum<minsum){
                    minsum = sum;
                }
            }
            System.out.println();

            System.out.println("Total sum: " + totalsum);
            System.out.println("Maximum subarray sum: " + maxsum);
            System.out.println("minimum subarray sum: " + minsum);
        }
    }

    public static void main(String args[]){

        int numbers[] = {1, 2, 3, 4, 5};
        SubArrays(numbers);
    }
}
