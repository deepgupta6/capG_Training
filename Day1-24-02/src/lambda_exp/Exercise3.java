package lambda_exp;

public class Exercise3 {
    public static void main(String[] args) {
        IAuthentication i = (a,b)->{
            if(b.length()>8 && a!="") return true;
            else return false;
        };

        System.out.println(i.authenticate("admin","adminaaaa"));
    }
}
