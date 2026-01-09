package IntroDemo;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
     //String is an object in Java
	
		//String literal
		String s="Rahul Shetty";
		String s1="Rahul Shetty";
		String s5= "Hello";
		
		
		//new keyword
		String s2=new String("Rahul Shetty");
		String s3=new String("Rahul Shetty");
		
		String x= "Chandu QA Tsting";
		String []splitingStrings=x.split("QA");
		System.out.println(splitingStrings[0]); //Chandu
		System.out.println(splitingStrings[1]); //QA
	
		System.out.println(splitingStrings[1].trim());; //Tsting
		
		for(int i=s.length()-1; i>=0; i--) 
		{
			System.out.println(x.charAt(i));
		}
		
		
	
	}

}
