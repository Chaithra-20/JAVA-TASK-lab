import java.util.Scanner;
class ReverseNumber{

public static void main(String args[])
{
	int num,sum=0; //init
	Scanner ck=new Scanner(System.in); //create a scanner object to get user input
	System.out.println("Enter the number"); //getting the number
	num=ck.nextInt();
	
	while(num!=0)  //loop for number
	{
	int rem=num%10;  //getting remainder
	sum=sum*10+rem;
	num=num/10;
	}
		System.out.println("Reverse number is:"+sum);  //print the number is reverse or not
}
}
	
	