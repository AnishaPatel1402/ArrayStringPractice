//remove spaces from string
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

       StringBuffer sb = new StringBuffer();
       for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ') sb.append(str.charAt(i));
       }
       System.out.println("String without space = "+ sb);
    }
}