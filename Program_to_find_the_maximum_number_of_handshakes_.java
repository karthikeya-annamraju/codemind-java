import java.util.Scanner;
public class HandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num*(num-1)/2);
    }
}