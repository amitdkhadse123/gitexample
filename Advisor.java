
//package techm.itp.hyd10095.cs77673.Amit;
import java.awt.*;
import java.util.*;
public class Advisor
{
	String msg[]=new String[5];
	int count=0;
	public Advisor(String s)
	{
		String s1=new String(s);
		msg[count]=s1;
		count++;
	}
	public void getAdvice()
	{
		Random r=new Random();
		int a=r.nextInt(3);
		System.out.println("Advice:"+msg[a]);
	}

}