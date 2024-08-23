import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() ;
  int cnt = 0;
        for (int i = 0; i< str.length(); i++)
        {
            if(checkvowels(str.charAt(i)) == true)
            { cnt++;}
        }
        System.out.println(cnt);
    }
public static boolean checkvowels(char x)

{ boolean flat = true;
    if(x == 'e'|| x == 'u' || x == 'o' || x == 'a' || x == 'i')
    {
        return flat;
    }
    else{ flat = false ;
    return flat;}

}
}
