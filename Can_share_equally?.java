import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x%2==0 && (x>0 || y%2==0))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}