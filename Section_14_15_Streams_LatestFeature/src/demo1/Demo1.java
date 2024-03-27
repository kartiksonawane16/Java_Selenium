package demo1;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
//		String[] s = {"Rama", "Kartik", "Ajay", "Anad", "Lokesh", "zzz"};
//		List list = Arrays.asList(s);
//		list.stream().sorted().forEach(a-> System.out.println(a));
//		double d = list.stream().count();
//		System.out.println(d);
		
		Integer[] i = {1,2,2,3,4,5,6,3,4,4,8,22,23,34,34,5};
		List<Integer> list2 = Arrays.asList(i);
		list2.stream().distinct().forEach(s->System.out.println(s));

	}

}
