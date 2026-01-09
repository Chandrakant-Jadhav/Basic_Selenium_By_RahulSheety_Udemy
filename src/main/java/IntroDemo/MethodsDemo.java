package IntroDemo;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo obj=new MethodsDemo();
		obj.getData();
		
		String name=obj.getData();
		System.out.println(name);
		
		
		
		MethodsDemo.getData02();

	}
	
	public String getData()
	{
		System.out.println("Get Data non static Method");
		
		return "Chnadu Non static Method";
	}
	
	public static void getData02()
	{
		System.out.println("Get Data static Method");
	}

}
