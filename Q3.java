import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = reverseString(str1);
        if(str1.equals(str2) == true )
        {
            System.out.println("This is palidrome");
        }
        else {System.out.println("This is not palidrome");}
    }
    public static String reverseString(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }

}
