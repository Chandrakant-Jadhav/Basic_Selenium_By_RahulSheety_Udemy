package IntroDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array
		
		int [] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//arr[5]=60; //ArrayIndexOutOfBoundsException
		
		
		int []arr1= {1,2,3,4,5};
		
		System.out.println(arr1[2]);
		
		
		//For loop
		for(int i=0; i<=arr1.length-1; i++) 
		{
			System.out.println(arr1[i]);
		}
		
		
		
		String [] name= {"Rahul", "Shetyy", "QA", "Selenium"};
		
		for(int i=0; i<name.length; i++) 
		{
			System.out.print(name[i]+ " ");
		}
		
		//For each loop or Enhanced for loop
		for(String s:name)
		{
			System.out.print(s+ " ");
		}
		
		ArrayList <String>a =new ArrayList<String>();
		//create object of the class 
		
		a.add("Rahul");
		a.add("Shetty");
		a.add("QA");
		a.add("Selenium");
		a.remove(1); //removing element at index 2
		
		a.get(1); //fetching element at index 3
		
		System.out.println(a.get(2));
		// a.get(5); //IndexOutOfBoundsException
		
		
		for(int i=0; i<a.size(); i++) 
		{
			System.out.print(a.get(i)+ " ");
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		for(String val:a)
		{
			System.out.println(val+ " ");
		}
		
		//item is present in the arraylist or not
		
		System.out.println(a.contains("QA")); //true
		
		
		//Converting array to arraylist
		
		String [] names= {"Rahul", "Shetty", "QA", "Selenium"};
		
		List<String> namesList=Arrays.asList(names);
		namesList.contains("QA");
	
	}

}
