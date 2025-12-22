//Reverse an array
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

    //using extra array
    //    int rev[] = new int[n];
    //    for(int i=0; i<n; i++){
    //     int idx = n-i-1;
    //     rev[i] = arr[idx];
    //    }

    //    for(int i: rev){
    //     System.out.print(i+" ");
    //    }


    //inplace
    //swap arr[i] => arr[n-i-1]
    for(int i=0; i<n/2; i++){
        int idx = n-i-1;
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

    for(int i: arr){
        System.out.print(i+" ");
    }

    }
}