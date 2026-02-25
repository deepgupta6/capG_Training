package method_ref;
public class Main {

	public static void main(String[] args) {
		
		Fact f = new Fact();
		
		Ifact i = f::factorial;
		
		System.out.println(i.factorial(4));

	}

}
