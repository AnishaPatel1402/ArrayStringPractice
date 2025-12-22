//Convert lowercase to uppercase and vice versa (without built-in)

import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char chArr[] = str.toCharArray();
        for(int i=0; i<chArr.length; i++){
            if(chArr[i]>= 65 && chArr[i]<= 90){ //uppercase
                chArr[i]= (char) (chArr[i]+ 32);
            } 
            else if(chArr[i]>= 97 && chArr[i]<= 122){ //lower case
                chArr[i]= (char) (chArr[i]- 32);
            }
        }
        System.out.println("String = "+ String .valueOf(chArr));
    }
}