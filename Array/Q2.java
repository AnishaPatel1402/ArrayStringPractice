//Find min
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // int min = Integer.MAX_VALUE;
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]) min = arr[i];
        }
        System.out.println("min : "+ min);
    }
}