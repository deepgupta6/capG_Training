package lambda_exp;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        Cal i = (a,b)->(int)Math.pow(a,b);

        System.out.println(i.calculate(x, y));
        sc.close();
    }



}
