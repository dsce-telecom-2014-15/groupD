package myproject;

/**
 * 
 * @author Aashika
 *
 */

public class binarysearch {

	public static void main(String[] args) {
		// sorted array
		int[] ar = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int se = 4;
		int li = 0, hi = ar.length, mi = (hi + li) / 2;

		// termination condition
		while (hi > li) {
			if (ar[mi] == se) {
				System.out.println("the index number of the element " + se
						+ " is " + mi);
				break;
			} else if (ar[mi] > se) {
				hi = mi;
			} else {
				li = mi;
			}
			mi = (hi + li) / 2;

		}
	}
}
