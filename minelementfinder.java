package myproject;
import java.util.Arrays;
/**
 * -
 * @author Aashika
 *
 */
public class minelementfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myIntArray={41,32,23,44,56,46,77,68,79,15};
int minElement=999;
for(int i=0;i<myIntArray.length;i++){
	if(myIntArray[i]<minElement){
		minElement=myIntArray[i];
		
	}
}
System.out.println("Minimum element in"+Arrays.toString(myIntArray)+"is"+minElement);
	}
	
}
