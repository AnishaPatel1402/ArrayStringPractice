class Solution {
    //leetcode 27
    public int removeElement(int[] arr, int val) {
        int n = arr.length;

        //Two pointer approach
        // int i = 0, j = n-1;
        // while(i<=j){
        //     if(arr[i]==val){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         j--;
        //     }
        //     else i++;
        // }
        // return i;

        //simple one pointer 
        int i = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] != val){
                arr[i++] = arr[j];
            }
        }
        return i;
    }
}