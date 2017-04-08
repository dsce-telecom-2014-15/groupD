package myproject;
import java.io.*;
public class minfinderaray {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num of elements");
		int n=Integer.parseInt(br.readLine());
		int[] a=new int[n];
		System.out.println("Enter elemnts");
		int i=-1;
		while(++i<n)
			a[i]=Integer.parseInt(br.readLine());
		i=1;int s=a[0];
			for(;i<n;i++)
			if(s>a[i])s=a[i];
		System.out.println("Smallest element-"+s);
	}

}
