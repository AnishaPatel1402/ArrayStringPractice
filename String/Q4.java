//Check string is pallindrome or not
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        boolean flag = true;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("string is pallindrome");
        else System.out.println("string is not pallindrome");
    }
}