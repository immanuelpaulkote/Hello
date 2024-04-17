import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreams {

	public static void main(String[] args) {
//		ArrayList<String> l = new ArrayList<String>();
//		l.add("ahgfd");
//		l.add("bhgfd");
//		l.add("ahgfd");
//		l.add("chgfd");
//		l.add("ahgfd");
//		int j=0;
//		for(int i=0;i<l.size();i++) {
//			if(l.get(i).startsWith("a")) {
//				j++;
//			}
//			
//		}
//		System.out.println(j);
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("ahgfda");
		l.add("bhgfd");
		l.add("ahgfdd");
		l.add("chgfd");
		l.add("ahgfd");
		//streamFilter
		Long count=l.stream().filter(s->s.startsWith("a")).count();
		System.out.println(count);
		
		//Stream.of("ahgfd","bhgfd","ahgfd","chgfd","ahgfd").filter(s->s.startsWith("a")).count();
		l.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		l.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		
		//streamMap
		Stream.of("ahgfda","bhgfd","ahgfdd","chgfd","ahgfd").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("**************");
		List<String> l1=Arrays.asList("azgfda","bhgfd","aygfdd","chgfd","ahgfd");
		l1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Merging 2lists
		System.out.println("**************");
		List<String> l2=Arrays.asList("aaaa","bbb","ccccc","ddddd","ee");
		Stream<String> newStream=Stream.concat(l1.stream(), l2.stream());
		//newStream.forEach(s->System.out.println(s));
		
		//Match
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("ccccc"));
		Assert.assertTrue(flag);
		
		//streamCollect
		System.out.println("**************");
		List<String> ls=Stream.of("ahgfda","bhgfd","ahgfdd","chgfd","ahgfd").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//print unique num of array, sort them
		System.out.println("**************");
		List<Integer> num=Arrays.asList(1,3,2,2,6,5,4,5,6);
		num.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> num1=num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("**************");
		System.out.println(num1.get(2));



	}
}
