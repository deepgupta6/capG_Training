package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
//		Stream<Integer> s = Stream.of(23,45,12,78);
//		Predicate<Integer> p = i->i>30;
//		s.filter(p).forEach(num->System.out.println(num));
		
//		s.filter(i->i<20).forEach(num->System.out.println(num));
//		s.map(i->i<20).forEach(num->System.out.println(num));
//		s.filter(i->i<20).map(i->i*i).forEach(num->System.out.println(num));
		
		List<String> names = new ArrayList<String>();
		names.add("Amit");
		names.add("Saurabh");
		names.add("Ashtam");
		names.add("Yogendra");
		names.add("Vinay");
		names.add("Aman");
		names.add("Samar");
		names.add("Saksham");
		
//		names.stream().sorted().forEach(s->System.out.println(s));
//		List<String> li = names.stream().filter(name->name.startsWith("A")).sorted().collect(Collectors.toList());
//		List<String> li = names.stream().filter(name->name.startsWith("A")).sorted().map(s->s.concat(" Kumar")).collect(Collectors.toList());
//		System.out.println(li);
		
//		names.stream().redu
		
		Map<String,Long> m = names.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
		System.out.println(m);
	}

}
