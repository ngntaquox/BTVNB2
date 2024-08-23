import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Invalid");
        }
        else{

            for(int i = 0; i < num; i++)
            {
                for(int j = 1 ; j<num -i; j++)
                {System.out.print(" "); }
                for (int z = 0; z< i*2 +1; z++)
                {System.out.print("*");}

System.out.println();
            }

        }
    }
}