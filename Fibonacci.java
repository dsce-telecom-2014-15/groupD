package myproject;
/**
 * 
 * @author Aashika
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstTerm=0,secondTerm=1;
int noofTermsToPrint=10;
System.out.println(firstTerm+" ");
System.out.println(secondTerm+ " ");
int nextTerm;
for(int i=0;i<noofTermsToPrint - 2;i++){
	nextTerm=firstTerm+secondTerm;
	firstTerm=secondTerm;
	secondTerm=nextTerm;
	System.out.println(nextTerm + " ");
}
	
	}

}
