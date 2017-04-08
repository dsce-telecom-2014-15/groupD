package myproject;
/**
 * 
 * @author Aashika
 *
 */
public class arrayelementsadder {

	public static void main(String[] args) {
		// TODO elemtnts of array a to be added
int[]a={0,1,2,3,4};
int[]b={5,6,7,8,9};
int sum=0,i=0;
for(i=0;i<a.length;i++){sum=sum+a[i]+b[i];}
System.out.println("Sum of the array is "+sum);
	}

}
