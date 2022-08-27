package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("this", "is" , "a" , "list", "period");
			
		System.out.println(strings);
		Stream<String> stream = strings.stream();
		
		System.out.println(stream);
		
		Stream<String> limit = stream.limit(4);
		System.out.println("limit = " +limit);
		
		List<String> collectorList = limit.collect(Collectors.toList());
		System.out.println("List of 4 limit: " +collectorList);
		
		// the same thing chained
		List<String> stringsTwo = Arrays.asList("this", "is" , "a" , "list", "period");
		List<String> result = stringsTwo.stream()
										.sorted()
										.limit(3)
										.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
