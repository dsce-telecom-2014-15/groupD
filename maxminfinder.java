package myproject;
import java.io.*;
public class maxminfinder {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num of elements");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the elements");
		int a[]=new int[n];
		int i=0;
		for(;i<n;i++)
			a[i]=Integer.parseInt(br.readLine());
		int b=a[0],c=a[0];
		// Define 2 methods getMin getMax to accept array as param and return min, max value respectively
		for(i=0;i<n;i++)
		{if(b>a[i])b=a[i];
		 if(c<a[i])c=a[i];
		}
		System.out.println("Min="+b);
		System.out.println("Max="+c);
				
		
	}

}
