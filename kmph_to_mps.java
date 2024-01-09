import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kmph = sc.nextFloat();
        float mph = kmph*0.277777f;
        System.out.printf("%.2f",mph);
    }
}