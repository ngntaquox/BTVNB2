import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int a = Integer.parseInt(sc.nextLine());

String str = sc.nextLine();
int b = str.length();
boolean Flat = true ;
if( a == b)
{
    System.out.println(Flat);
}
else {
    Flat = false;
    System.out.println(Flat);

}

    }
}