import java.util.Scanner;
class PatternWithForLoop{

public static void main(String args[])
{
	int i;	//initializing variable
	for(i=0;i<=121;i++)	//loop for values 
	{
		if(i%10==0)	//condition for remainder
		{
		System.out.println(i+1);	//print pattern
		}
	}
}
}
	