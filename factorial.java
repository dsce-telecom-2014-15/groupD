package myproject;
/**
 * 
 * @author Aashika
 *
 */
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =0;
int factorial=n, nCopy=n;
while(n!=1){
	factorial = factorial* (n-- -1);
}
System.out.println("Factorial of "+ nCopy +"is" +factorial);

	
}
}