package myproject;
import java.io.*;
public class StudentList {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String a[]=new String[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("enter name");
			a[i]=br.readLine();
		}
		for(int i=0;i<10;i++)
			System.out.println(a[i]);
	}

}
