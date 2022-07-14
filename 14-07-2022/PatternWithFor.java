import java.util.Scanner;
class PatternWithFor{

public static void main(String args[])
{
	int i;//init
	for(i=0;i<=121;i++)//loop for values
	{
		if(i%10==0)//condition for remainder
		{
		System.out.println(i+9);//print pattern
		}
	}
}
}