package corejaavasql;

public class ternary {
	public static void main(String [] args) {
	int a=100;
	int b=20;
	
	int max=(a>b)?a:b;   //if condition ternary operator(return true 1st value) ;(return false 2nd value)
	int min=(a<b)?b:a;
	
	int min1=(b<a)?a:b;
	
	System.out.println(max);
	System.out.println(min);
	System.out.println(min1);
	
}
}