package JavaStreams;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class test01 {

	@Test
	public void regular() {
		
		//count the number of name starting with A
		List<String> names=new ArrayList<String>();
		names.add("Anil");
		names.add("Ravi");
		names.add("Amit");
		names.add("Suresh");
		names.add("Ajay");
		
		int count=0;
		for(int i=0; i<names.size(); i++)
		{
			String actual=names.get(i);
			
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println("The Count of name started with 'A' is = "+ count);

	}
	
	@Test
	public void streamFilter() {
		
		//count the number of name starting with A using streams
		List<String> names=new ArrayList<String>();
		names.add("Anil");
		names.add("Ravi");
		names.add("Amit");
		names.add("Suresh");
		names.add("Ajay");
		
		Long c=names.stream().filter(s-> s.startsWith("A")).count();
		System.out.println("The Count of name started with 'A' is = "+ c);
	}

}
