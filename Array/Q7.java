//given array of 0 and 1 only move all the 0s to end of array

import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int low = 0, high = n-1;
        while(low < high){
            if(arr[low]==1) low++;
            if(arr[high]==0) high--;
            else if(arr[low] == 0 && arr[high] == 1){
                //swap low and high
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
       
       for(int i: arr)System.out.print(i+" ");
    }
}