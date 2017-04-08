package myproject;
/**
 * 
 * @author Aashika
 *
 */
public class selectivenoprinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=100;i++){
	if(i>10 && i<15)
		continue;
	System.out.println(i);
}
	}

}
