	
											//	Method in java

//Set of code (or)  block of code (or) code of instruction that perform specific action
//In java method, different argument passing the methods.
//Reusablity of code multiple times. It's help to highly efficient and effectively on code
package corejaavasql;

public class Method {

	int a;
	int b;
	
	int add()
	{	
		int a=10;
		int b=20;
		System.out.println("Addition Result is: "+(a+b));
		return a+b;
	}
	
	int add1(int a,int b)
	{
		int result=a+b;
		System.out.println("Addition Result calling method multiple times is: "+result);
		return result;
	}
	
	public static void main(String [] args) 
	{
	Method m=new Method();
	
		m.a=20;
		m.b=10;
	m.add();	
	m.add1(25,30);
	m.add1(30,50);
	
	
	}
	
}
