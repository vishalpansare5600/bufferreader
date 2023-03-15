import java.io.*;
public class Test 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int a,b,sum;
		System.out.println("enter value of a=");
		a=Integer.parseInt(br.readLine());
		System.out.println("enter value of b=");
		b=Integer.parseInt(br.readLine());
		sum=a+b;
		System.out.println("sum="+sum);
	}

}
