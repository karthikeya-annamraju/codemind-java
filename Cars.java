import java.util.Scanner;
public class Cars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = sc.nextInt();
        if (n1 > n2) {
            System.out.println("-1");
        }
        else {
            int ans = (x/(n2-n1));
            System.out.println(ans+1);
        }
    }
}