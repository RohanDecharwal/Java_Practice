import java.util.*;

public class Patterns{

    public static void Hollow_Rectangle(int totRows, int totCols){
        for(int i = 1; i <= totRows; i++){
            for(int j = 1; j <= totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Half_Pyramid(int n){
        //outer loop
        for (int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_numbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void Floyds_Triangle(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static int zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    public static void buterfly(int n){
        //first half
        for(int i=1; i<=n; i++){
            //STARS - i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            //SPACES - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            //STARS - i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half
        for(int i=n; i>=1; i--){
            //STARS - iI
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }

            //SPACES - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            //STARS - i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n){
        for(int i=1; i<=n; i++){

            //Spaces
            for(int j =1; j<=(n-i); j++){
                System.out.print("  ");
            }
            //Stars
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){

            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }

            //Stars
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i=1; i<=n; i++){

            //Spaces
            for(int j= 1; j<=(n-i); j++){
                System.out.print("  ");
            }

            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }

            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        //Hollow_Rectangle(10, 20);
        //Half_Pyramid(4);
        //inverted_half_pyramid_with_numbers(10);
        //Floyds_Triangle(10);
        //zero_one_triangle(5);
        //buterfly(4);
        //rhombus(5);
        //hollow_rhombus(10);
        diamond(5);
    }
}