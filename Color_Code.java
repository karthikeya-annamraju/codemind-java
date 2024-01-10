import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        char v = 'v';
        char i = 'i';
        char b = 'b';
        char g = 'g';
        char y = 'y';
        char o = 'o';
        char r = 'r';
        if ((s == 'v') || (s=='V')) {
            System.out.println("Violet");
        } 
        else if ((s == 'i') || (s == 'I')) {
            System.out.println("Indigo");
        } 
        else if ((s == 'b') || (s == 'B')){
            System.out.println("Blue");
        } 
        else if ((s == 'g') || (s == 'G')) {
            System.out.println("Green");
        } 
        else if ((s == 'y') || (s == 'Y')) {
            System.out.println("Yellow");
        } 
        else if ((s == 'o') || (s == 'O')) {
            System.out.println("Orange");
        } 
        else if ((s == 'R')) {
            System.out.println("Red");
        } 
        else {
            System.out.println("-1");
        }
    }
}