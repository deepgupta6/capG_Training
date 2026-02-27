package lambda_exp;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();
        IformatString j = (a)->{
            StringBuilder b = new StringBuilder();
            for(int i=0;i<a.length();i++){
                b.append(a.charAt(i)+ " ");
            }
            return b;
        };

        System.out.println(j.format(x));
        sc.close();
    }
}
