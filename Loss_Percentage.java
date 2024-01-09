import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int cp = sc.nextInt();
        int sp = sc.nextInt();
        float loss;
        loss=cp-sp;
        float per;
        per= (loss/cp)*100;
        System.out.printf("%.2f",per);
    }
}