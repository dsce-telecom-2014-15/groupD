package myproject;

import java.util.Arrays;

/**
 * 
 * @author Aashika
 *
 */
public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myIntArray={1,2,3,3,3,3,4,5,6,7,8,9,10};
int searchElement=3;

for (int i=0;i<myIntArray.length;i++){
	if (myIntArray[i]==searchElement){
		System.out.println("In"+Arrays.toString(myIntArray)+"element"+searchElement+"is found at index"+i);
		}
	}
	}

}
