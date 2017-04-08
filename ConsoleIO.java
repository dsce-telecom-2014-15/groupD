package myproject;

import java.io.*;

public class ConsoleIO {

	public static void main(String[] args)throws Exception 
	{
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integer");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter double value");
		double b=Double.parseDouble(br.readLine());
		System.out.println("Enter a String");
		String s=br.readLine();
		System.out.println("Integer-"+a);
		System.out.println("Double-"+b);
		System.out.println("String-"+s);
		
		

	}

}
