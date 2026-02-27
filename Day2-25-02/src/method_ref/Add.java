package method_ref;
public class Add {
	
	public static void main(String[] args) {
	Icalculator i = Exercise4::new;
	
	Exercise4 e = i.cal(10,5);
	
	e.add(e.a , e.b);
	
	}

}

 
