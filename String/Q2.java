//Reverse a string
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // String rev = "";
        // for(int i=0; i<str.length(); i++){
        //     rev += str.charAt(str.length()-i-1);  //string concatination  TC : O (n^2) => costly
        // }
        // System.out.println("Revers str = "+ rev);


        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length/2; i++){  //array traversal TC : O(N) => less costly
            char ch = arr[i];
            arr[i] = arr[arr.length-i-1];  
            arr[arr.length-i-1] = ch;
        }

        String rev = new String (arr);  // or => String rev = String.valueOf(arr);
        System.err.println("reverse: "+rev );
       
    }
}