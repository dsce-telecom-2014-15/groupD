package myproject;
/**
 * 
 * @author Aashika
 *
 */
public class ArrayMerge {
	// Code should be well formatted.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a={1,2,3,4,5};
int[]b={6,7,8,9,10};
int[]c=new int[a.length+b.length];
int i=0;
for(i=0;i<a.length;i++)
{
	c[i]=a[i];
}
for(i=0;i<b.length;i++)
{
	c[i+a.length]=b[i];
}
for(i=0;i<c.length;i++)
	System.out.println(c[i]);

	
	}

}
