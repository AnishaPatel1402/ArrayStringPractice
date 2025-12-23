//second largest
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

       //find 1st large
    //    int max1 = arr[0];
    //    for(int i=1; i<n; i++){
    //         if(arr[i] > max1) max1 = arr[i];
    //    }

    //    int max2 = Integer.MIN_VALUE;
    //     for(int i=1; i<n; i++){
    //         if(arr[i]!=max1 && arr[i] > max2) max2 = arr[i];
    //     }

    //     System.out.println("Max1: "+ max1);
    //     System.out.println("Max2: "+ max2);



        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;

        for(int i=1; i<n; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i]!=max1) max2 = arr[i];
        }
        System.out.println("Max1: "+ max1);
        System.out.println("Max2: "+ max2);
    }
}