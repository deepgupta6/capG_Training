package method_ref;
public class Fact {
	//int n;
	
	public int factorial(int n) {
		if(n==0 || n== 1) return 1;
		return n*factorial(n-1);
	}

}
